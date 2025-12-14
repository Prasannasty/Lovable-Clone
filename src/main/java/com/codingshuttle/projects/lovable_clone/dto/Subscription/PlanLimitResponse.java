package com.codingshuttle.projects.lovable_clone.dto.Subscription;

public record PlanLimitResponse(
        String planName,
        Integer maxTokenPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}
