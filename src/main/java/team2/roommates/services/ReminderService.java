package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Reminder;
import team2.roommates.repositories.ReminderRepository;

import java.util.List;

@Service
public class ReminderService {
    @Autowired
    ReminderRepository reminderRepository;

    public Reminder createReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public Reminder updateReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void deleteReminder(int reminderId) {
        reminderRepository.deleteById(reminderId);
    }

    public List<Reminder> getRemindersByResidentId(int residentId) {
        return reminderRepository.getRemindersByResidentId(residentId);
    }
}