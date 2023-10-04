package com.uem.UniversityEventManagement.controller;

import com.uem.UniversityEventManagement.model.Event;
import com.uem.UniversityEventManagement.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEventsByDate(@RequestParam LocalDate date) {
        return eventService.getAllEventsByDate(date);
    }

    @PostMapping("/add")
    public String addEvent(@Valid @RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @PutMapping("/update/{id}")
    public String updateEvent(@PathVariable Long id, @Valid @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Long id) {
        return eventService.deleteEvent(id);
    }

}
