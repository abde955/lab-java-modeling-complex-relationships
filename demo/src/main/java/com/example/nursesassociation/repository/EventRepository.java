package com.example.nursesassociation.repository;

import com.example.nursesassociation.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
