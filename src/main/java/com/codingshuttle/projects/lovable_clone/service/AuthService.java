package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.AuthResponse;
import com.codingshuttle.projects.lovable_clone.dto.LoginRequest;
import com.codingshuttle.projects.lovable_clone.dto.SignUpRequest;

public interface AuthService {
    AuthResponse signup(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
