package com.example.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@EnableMethodSecurity
public class UserController {

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping
    public String userPage() {
        return "User Page";
    }
}
