package com.codingshuttle.projects.lovable_clone.dto.member;

import com.codingshuttle.projects.lovable_clone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userid,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
