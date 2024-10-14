package com.example.nursesassociation.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int duration;
    private String location;
    private String title;

    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Guest> guests;

    // Getters and Setters
}
