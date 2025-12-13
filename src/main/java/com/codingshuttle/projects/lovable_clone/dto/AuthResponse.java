package com.codingshuttle.projects.lovable_clone.dto;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
