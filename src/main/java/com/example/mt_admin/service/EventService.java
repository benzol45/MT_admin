package com.example.mt_admin.service;

import com.example.mt_admin.entity.Event;
import com.example.mt_admin.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void receiveEvent(Event event) {
        eventRepository.save(event);
    }
}
