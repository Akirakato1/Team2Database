package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Event;
import team2.roommates.models.Apartment;
import team2.roommates.models.RSVP;
import team2.roommates.services.RSVPService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RSVPController {
    @Autowired
    RSVPService service;

    @PostMapping("/api/rsvp/{eventId}/{apartmentId}")
    public RSVP createRSVP(
            @PathVariable int eventId,
            @PathVariable int apartmentId
    ) {
        return service.createRSVP(eventId, apartmentId);
    }

    @DeleteMapping("/api/rsvp/{eventId}/{apartmentId}")
    public void deleteRSVP(
            @PathVariable int eventId,
            @PathVariable int apartmentId
    ) {
        service.deleteRSVP(eventId, apartmentId);
    }

    @GetMapping("/api/events/{id}/apartments")
    public List<Apartment> getApartmentsForEventId(
            @PathVariable int id
    ) {
        return service.getApartmentsForEventId(id);
    }

    @GetMapping("/api/apartments/{id}/events")
    public List<Event> getEventsForApartmentId(
            @PathVariable int id
    ) {
        return service.getEventsForApartmentId(id);
    }
}
