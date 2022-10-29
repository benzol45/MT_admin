package com.example.mt_admin.controller;

import com.example.mt_admin.DTO.EventDTO;
import com.example.mt_admin.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping()
    public String getEventsPage(Model model) {
        List<EventDTO> eventDTOList = eventService.getAllUnhiddenEvents().stream()
                .map(EventDTO::convertFromEvent)
                .collect(Collectors.toList());

        model.addAttribute("events", eventDTOList);
        return "events";
    }

    @GetMapping("/hide/{id}")
    public String hideEvent(@PathVariable("id") long id) {
        eventService.hideEvent(id);

        return "redirect:/event";
    }
}
