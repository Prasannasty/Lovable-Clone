package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    Project project;
    User user;
    String action;
    Integer tokensUsed;
    Integer durationMs;
    String metaData; //JSON of model used and prompt
    Instant createdAt;

}
