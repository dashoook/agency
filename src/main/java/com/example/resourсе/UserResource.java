package com.example.resourсе;

import com.example.dto.UserDTO;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO getUserById(final @PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public UserDTO createUser(final @RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @PutMapping("/users")
    public UserDTO getUserById(final @RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(final @PathVariable Long id){
        userService.deleteUserById(id);
    }
}
