package com.example.mt_admin.DTO;

import com.example.mt_admin.entity.Event;
import com.example.mt_admin.entity.EventType;

import java.util.Date;
import java.util.Locale;

public class EventDTO {
    private String type;
    private String message;

    public EventDTO() {
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
        Event event = new Event();
        event.setHide(false);
        event.setDate(new Date());
        event.setType(EventType.valueOf(this.type.toUpperCase()));
        event.setMessage(this.message);

        return event;
    }
}
