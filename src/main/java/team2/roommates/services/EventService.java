package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Event;
import team2.roommates.repositories.EventRepository;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository userEventRepository;

    public Event createUserEvent(Event event) {
        return userEventRepository.save(event);
    }

    public Event updateUserEvent(Event event) {
        return userEventRepository.save(event);
    }

    public void deleteUserEvent(int userEventId) {
        userEventRepository.deleteById(userEventId);
    }

    public Event getEventById(int id) { return userEventRepository.findById(id).get(); }

    public List<Event> getAllEvents() { return (List<Event>) userEventRepository.findAll(); }
}
