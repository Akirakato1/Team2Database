package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.GroceryItem;

import java.util.List;

public interface GroceryItemRepository extends CrudRepository<GroceryItem, Integer> {
    @Query(value = "SELECT * FROM groceryItems where apartment_id=:apartmentId", nativeQuery = true)
    List<GroceryItem> getGroceryItemsByApartmentId(
            @Param("apartmentId") int apartmentId
    );
}
