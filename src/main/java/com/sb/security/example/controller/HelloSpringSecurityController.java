package com.sb.security.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class HelloSpringSecurityController {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to spring security basic example";
    }
}
