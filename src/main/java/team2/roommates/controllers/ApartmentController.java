package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Apartment;
import team2.roommates.models.RSVP;
import team2.roommates.repositories.RSVPRepository;
import team2.roommates.services.ApartmentService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApartmentController {
    @Autowired
    ApartmentService apartmentService;
    @Autowired
    RSVPRepository rsvpRepository;

    @PostMapping("/api/apartments")
    public Apartment createApartment(
            @RequestBody Apartment apartment
    ) {
        return apartmentService.createApartment(apartment);
    }

    @PutMapping("/api/apartments")
    public Apartment updateApartment(
            @RequestBody Apartment apartment
    ) {
        return apartmentService.updateApartment(apartment);
    }

    @DeleteMapping("/api/apartments/{apartmentId}")
    public void deleteApartment(
            @PathVariable int apartmentId
    ) {
        apartmentService.deleteApartment(apartmentId);
        List<RSVP> rsvps = rsvpRepository.getRSVPSByApartmentId(apartmentId);
        rsvpRepository.deleteAll(rsvps);
    }

    @GetMapping("/api/apartments")
    public List<Apartment> getAllApartments()
    {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/api/apartments/{apartmentId}")
    public Apartment getApartmentById(
            @PathVariable int apartmentId
    )
    {
        return apartmentService.getApartmentById(apartmentId);
    }
    
    @GetMapping("/api/admins/{adminid}/apartments")
    public List<Apartment> getApartmentsByAdminId(
            @PathVariable int id
    )
    {
        return apartmentService.getApartmentsByAdminId(id);
    }
}
