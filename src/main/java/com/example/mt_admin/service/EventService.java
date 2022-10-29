package com.example.mt_admin.service;

import com.example.mt_admin.DTO.EventDTO;
import com.example.mt_admin.entity.Event;
import com.example.mt_admin.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Event> getAllUnhiddenEvents() {
        return eventRepository.findAllByHideIsFalseOrderByDateAsc();
    }

    public void hideEvent(long id) {
        Event event = eventRepository.findById(id).orElseThrow();
        event.setHide(true);
        eventRepository.save(event);
    }
}
