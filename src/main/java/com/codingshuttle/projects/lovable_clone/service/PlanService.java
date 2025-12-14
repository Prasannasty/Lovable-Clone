package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.Subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
