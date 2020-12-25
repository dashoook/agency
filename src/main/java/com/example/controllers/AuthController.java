package com.example.controllers;

import com.example.dto.ERoleDTO;
import com.example.dto.RoleDTO;
import com.example.dto.UserDTO;
import com.example.mapper.RoleToRoleDTOMapper;
import com.example.mapper.UserToUserDTOMapper;
import com.example.models.ERole;
import com.example.models.Role;

import com.example.models.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import com.example.request.LoginRequest;
import com.example.request.SignupRequest;
import com.example.responce.JwtResponse;

import com.example.service.UserService;
import com.example.service.impl.UserDetailsImpl;
import com.example.service.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    private UserToUserDTOMapper userMapper;

    @Autowired
    private RoleToRoleDTOMapper roleMapper;

    @Autowired
    private UserService userService;


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
        System.out.println(userDetails.getAuthorities());

        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getFirstname(),
                userDetails.getLastname(),
                userDetails.getBirth(),
                roles));
    }

    @PostMapping("/signup")
    public String registerUser(@RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {//works
            return "Error: Username is already taken!";
        }

        // Create new user's account
        UserDTO user = new UserDTO(signUpRequest.getId(),
                signUpRequest.getUsername(),
                signUpRequest.getFirstname(),
                signUpRequest.getLastname(),
                signUpRequest.getBirth(),
                encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(ERole.ROLE_USER);
            //roles.add(roleMapper.toDto(userRole));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN);
                        //roles.add(roleMapper.toDto(adminRole));
                        roles.add(adminRole);
                        break;
                    case "mod":
                        Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR);
                        //roles.add(roleMapper.toDto(modRole));
                        roles.add(modRole);
                        break;
                    default:
                        Role userRole = roleRepository.findByName(ERole.ROLE_USER);
                        //roles.add(roleMapper.toDto(userRole));
                        roles.add(userRole);
                }
            });
        }
        user.setRoles(roles);
      //  userRepository.createUser(userMapper.toEntity(user));
        userService.createUser(user);

        return "User registered successfully!";
    }
}
