package com.memoryseal.memorysealbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nickname",length = 15, nullable = false)
    private String nickname;

    @Column(name = "profile_url", length = 100, nullable = true)
    private String profileUrl;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "user_active_status", nullable = false)
    private Boolean userActiveStatus;

}