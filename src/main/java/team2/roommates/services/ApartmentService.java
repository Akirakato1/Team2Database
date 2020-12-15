package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Apartment;
import team2.roommates.repositories.ApartmentRepository;

import java.util.List;


@Service
public class ApartmentService {
    @Autowired
    ApartmentRepository apartmentRepository;

    public Apartment getApartmentById(int id) { return apartmentRepository.findById(id).get(); }

    public List<Apartment> getAllApartments() { return (List<Apartment>) apartmentRepository.findAll(); }

    public Apartment createApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public Apartment updateApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public void deleteApartment(int apartmentId) {
        apartmentRepository.deleteById(apartmentId);
    }

	public List<Apartment> getApartmentsByAdminId(int id) {
		return (List<Apartment>) apartmentRepository.getApartmentsByAdminId(id);
	}
}
