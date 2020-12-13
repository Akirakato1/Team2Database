package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Event;
import team2.roommates.models.RSVP;
import team2.roommates.repositories.RSVPRepository;
import team2.roommates.services.EventService;
import team2.roommates.services.RSVPService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EventController {
    @Autowired
    EventService userEventService;
    @Autowired
    RSVPRepository rsvpRepository;

    @PostMapping("/api/events")
    public Event createUserEvent(
            @RequestBody Event event
    ) {
        return userEventService.createUserEvent(event);
    }

    @PutMapping("/api/events")
    public Event updateUserEvent(
            @RequestBody Event event
    ) {
        return userEventService.updateUserEvent(event);
    }

    @DeleteMapping("/api/events/{userEventId}")
    public void deleteUserEvent(
            @PathVariable int userEventId
    ) {
        userEventService.deleteUserEvent(userEventId);
        List<RSVP> rsvps = rsvpRepository.getRSVPSByEventId(userEventId);
        rsvpRepository.deleteAll(rsvps);
    }

    @GetMapping("/api/events")
    public List<Event> getAllEvents() {
        return userEventService.getAllEvents();
    }

    @GetMapping("/api/events/{id}")
    public Event getEventById(
            @PathVariable int id
    ) {
        return userEventService.getEventById(id);
    }
}
