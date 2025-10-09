package com.dcl.accommodate.entity;

import com.dcl.accommodate.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "role",nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "created_date",nullable = false,updatable = false)
    @CreatedDate
    private Instant createdDate;

    @Column(name = "last_modifier_",nullable = false)
    @LastModifiedDate
    private Instant lastModifierDate;

}
