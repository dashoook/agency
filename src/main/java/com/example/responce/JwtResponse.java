package com.example.responce;

import com.example.models.Order;

import java.time.LocalDate;
import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate birth;
    private List<String> roles;


    public JwtResponse(String accessToken, Long id, String username,  final String firstname, final String lastname,
                       final LocalDate birth,
                       List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;

        this.roles = roles;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(final LocalDate birth) {
        this.birth = birth;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
