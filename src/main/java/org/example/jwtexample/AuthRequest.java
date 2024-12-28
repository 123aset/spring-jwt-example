package org.example.jwtexample;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}