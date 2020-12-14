package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Event;
import team2.roommates.models.Apartment;
import team2.roommates.models.RSVP;
import team2.roommates.models.RSVPId;
import team2.roommates.repositories.EventRepository;
import team2.roommates.repositories.ApartmentRepository;
import team2.roommates.repositories.RSVPRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RSVPService {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    ApartmentRepository apartmentRepository;
    @Autowired
    RSVPRepository rsvpRepository;

    public RSVP createRSVP(
            int eventId,
            int apartmentId
    ) {
        RSVP rsvp = new RSVP();
        rsvp.setEventId(eventId);
        rsvp.setApartmentId(apartmentId);
        return rsvpRepository.save(rsvp);
    }

    public void deleteRSVP(
            int eventId,
            int apartmentId
    ) {
        List<RSVP> rsvps = rsvpRepository.getRSVPSByEventId(eventId);
        for (RSVP rsvp : rsvps) {
            if (rsvp.getApartmentId() == apartmentId) {
                rsvpRepository.delete(rsvp);
                return;
            }
        }
    }

    public List<Apartment> getApartmentsForEventId(int eventId) {
        List<RSVP> rsvps = rsvpRepository.getRSVPSByEventId(eventId);
        List<Apartment> apartments = new ArrayList<>();
        for (RSVP rsvp : rsvps) {
            apartments.add(apartmentRepository.findById(rsvp.getApartmentId()).get());
        }
        return apartments;
    }

    public List<Event> getEventsForApartmentId(int apartmentId) {
        List<RSVP> rsvps = rsvpRepository.getRSVPSByApartmentId(apartmentId);
        List<Event> events = new ArrayList<>();
        for (RSVP rsvp : rsvps) {
            events.add(eventRepository.findById(rsvp.getEventId()).get());
        }
        return events;
    }
}
