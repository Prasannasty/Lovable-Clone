package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

public class ProjectFile {
    Long id;
    Project project;
    String path;
    String minioObjectKey;
    Instant createdAt;
    Instant updatedAt;
    User updatedBy;
    User createdBy;
}
