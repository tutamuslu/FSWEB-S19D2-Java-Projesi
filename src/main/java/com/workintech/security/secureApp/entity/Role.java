package com.workintech.security.secureApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Scanner;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role", schema = "secure_app")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ıd")
    private int id;

    @Column(name = "authority")
    private String authority;
}
