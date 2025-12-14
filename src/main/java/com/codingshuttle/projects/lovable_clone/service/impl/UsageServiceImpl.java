package com.codingshuttle.projects.lovable_clone.service.impl;

import com.codingshuttle.projects.lovable_clone.dto.Subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.UsageTodayResponse;
import com.codingshuttle.projects.lovable_clone.service.usageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements usageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
