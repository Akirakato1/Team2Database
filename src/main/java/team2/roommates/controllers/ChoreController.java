package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Chore;
import team2.roommates.services.ChoreService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ChoreController {
    @Autowired
    ChoreService choreService;

    @PostMapping("/api/chores")
    public Chore createChore(
            @RequestBody Chore chore
    ) {
        return choreService.createChore(chore);
    }

    @PutMapping("/api/chores")
    public Chore updateChore(
            @RequestBody Chore chore
    ) {
        return choreService.updateChore(chore);
    }

    @DeleteMapping("/api/chores/{choreId}")
    public void deleteChore(
            @PathVariable int choreId
    ) {
        choreService.deleteChore(choreId);
    }

    @GetMapping("/api/apartments/{apartmentId}/chores")
    public List<Chore> getChoresByApartmentId(
            @PathVariable int apartmentId
    ) {
        return choreService.getChoresByApartmentId(apartmentId);
    }

    @GetMapping("/api/chores/{id}")
    public Chore getChoreById(
            @PathVariable int id
    ) {
        return choreService.getChoreById(id);
    }
}
