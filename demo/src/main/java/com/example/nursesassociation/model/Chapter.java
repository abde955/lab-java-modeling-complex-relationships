package com.example.nursesassociation.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany
    @JoinColumn(name = "chapter_id")
    private List<Member> members;

    // Getters and Setters
}
