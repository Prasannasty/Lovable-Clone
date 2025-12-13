package com.codingshuttle.projects.lovable_clone.dto;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
