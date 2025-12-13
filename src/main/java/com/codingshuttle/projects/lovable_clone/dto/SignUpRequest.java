package com.codingshuttle.projects.lovable_clone.dto;

public record SignUpRequest(
        String email,
        String name,
        String password
) {
}
