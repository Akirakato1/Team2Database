package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.UserEvent;
import team2.roommates.repositories.UserEventRepository;

import java.util.List;

@Service
public class UserEventService {
    @Autowired
    UserEventRepository userEventRepository;

    public UserEvent createUserEvent(UserEvent userEvent) {
        return userEventRepository.save(userEvent);
    }

    public UserEvent updateUserEvent(UserEvent userEvent) {
        return userEventRepository.save(userEvent);
    }

    public void deleteUserEvent(int userEventId) {
        userEventRepository.deleteById(userEventId);
    }

    public List<UserEvent> getUserEventsByCalendarId(int calendarId) {
        return userEventRepository.getUserEventsByCalendarId(calendarId);
    }
}
