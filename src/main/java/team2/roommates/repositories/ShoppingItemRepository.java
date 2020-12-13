package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.ShoppingItem;

import java.util.List;

public interface ShoppingItemRepository extends CrudRepository<ShoppingItem, Integer> {
    @Query(value = "SELECT * FROM shoppingItems where apartment_id=:apartmentId", nativeQuery = true)
    List<ShoppingItem> getShoppingItemsByApartmentId(
            @Param("apartmentId") int apartmentId);
}
