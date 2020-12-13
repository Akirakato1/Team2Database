package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Chore;
import team2.roommates.repositories.ChoreRepository;

import java.util.List;

@Service
public class ChoreService {
    @Autowired
    ChoreRepository choreRepository;

    public Chore createChore(Chore chore) {
        return choreRepository.save(chore);
    }

    public Chore updateChore(Chore chore) {
        return choreRepository.save(chore);
    }

    public void deleteChore(int choreId) {
        choreRepository.deleteById(choreId);
    }

    public List<Chore> getChoresByApartmentId(int apartmentId) {
        return choreRepository.getChoresByApartmentId(apartmentId);
    }

    public Chore getChoreById(int id) { return choreRepository.findById(id).get(); }
}
