package com.codingshuttle.projects.lovable_clone.service.impl;

import com.codingshuttle.projects.lovable_clone.dto.Subscription.CheckoutRequest;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.CheckoutResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.PortalResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.SubscriptionResponse;
import com.codingshuttle.projects.lovable_clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
