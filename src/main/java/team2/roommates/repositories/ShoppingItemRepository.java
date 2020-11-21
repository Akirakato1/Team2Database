package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.ShoppingItem;

import java.util.List;

public interface ShoppingItemRepository extends CrudRepository<ShoppingItem, Integer> {
    @Query(value = "SELECT * FROM shoppingItems where group_id=:groupId", nativeQuery = true)
    List<ShoppingItem> getShoppingItemsByGroupId(
            @Param("groupId") int groupId);
}
