package com.example.mt_admin.controller;

import com.example.mt_admin.DTO.EventDTO;
import com.example.mt_admin.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/receive")
    @ResponseBody
    public ResponseEntity receiveEvent(@RequestBody EventDTO eventDTO) {
        eventService.receiveEvent(eventDTO.convertToEvent());

        return new ResponseEntity(HttpStatus.OK);
    }

    //todo показ на странице и скрытие по кнопке
}
