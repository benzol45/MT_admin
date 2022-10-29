package com.example.mt_admin.DTO;

import com.example.mt_admin.entity.Event;
import com.example.mt_admin.entity.EventType;

import java.util.Date;

public class EventDTO {
    private long id;
    private String subsystem;
    private Date date;
    private String type;
    private String message;

    public EventDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    public Date getDate() {
        return date;
    }

    //TODO добавить нормальный вывод даты для показывания на экран

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Event convertToEvent() {
        //TODO возможно добавить в хранение из какой подсистемы пришло сообщение
        Event event = new Event();
        event.setHide(false);
        event.setDate(this.date);
        event.setType(EventType.valueOf(this.type.toUpperCase()));
        event.setMessage(this.message);

        return event;
    }

    public static EventDTO convertFromEvent(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setSubsystem("gateway");
        eventDTO.setDate(event.getDate());
        eventDTO.setType(event.getType().toString());
        eventDTO.setMessage(event.getMessage());

        return eventDTO;
    }
}
