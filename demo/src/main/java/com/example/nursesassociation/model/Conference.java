package com.example.nursesassociation.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    // Getters and Setters
}
