package com.example.service.impl;

import com.example.dto.RoleDTO;
import com.example.dto.UserDTO;
import com.example.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;
    final private Long id;

    final private String username;
    final private String firstname;
    final private String lastname;
    final private LocalDate birth;
    @JsonIgnore
    final private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(final Long id, final String username, final String firstname, final String lastname,
                           final LocalDate birth, final String password, final Collection<? extends GrantedAuthority>
                                   authorities) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(final UserDTO user) {
        final List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toList());

        return new UserDetailsImpl(
                user.getId(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getBirth(),
                user.getPassword(),
                authorities
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public Long getId() {
        return id;
    }
    public String getLastname() {
        return lastname;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public String getFirstname() {
        return firstname;
    }


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final UserDetailsImpl user = (UserDetailsImpl) o;
        return Objects.equals(id, user.id);
    }
}
