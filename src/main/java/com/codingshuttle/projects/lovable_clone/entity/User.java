package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    String passwordHash;
    String name;
    String avatarUrl;

    @CreationTimestamp
    Instant createdAt;

    Instant deletedAt;
    @UpdateTimestamp
    Instant updatedAt;
}
