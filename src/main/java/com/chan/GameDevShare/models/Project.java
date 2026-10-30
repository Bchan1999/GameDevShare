package com.chan.GameDevShare.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Column(unique = true)
    private UUID inviteToken; // the link is /join/{inviteToken}
}