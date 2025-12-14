package com.codingshuttle.projects.lovable_clone.dto.Subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokenPerDay,
        Boolean unlimitedAi,
        String price
) {
}
