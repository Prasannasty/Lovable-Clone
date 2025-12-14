package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.Subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.UsageTodayResponse;


public interface usageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
