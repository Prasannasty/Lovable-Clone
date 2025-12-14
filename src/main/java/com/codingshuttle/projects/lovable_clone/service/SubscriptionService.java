package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.Subscription.CheckoutRequest;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.CheckoutResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.PortalResponse;
import com.codingshuttle.projects.lovable_clone.dto.Subscription.SubscriptionResponse;


public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
