package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.ShoppingItem;
import team2.roommates.repositories.ShoppingItemRepository;

import java.util.List;

@Service
public class ShoppingItemService {
    @Autowired
    ShoppingItemRepository shoppingItemRepository;

    public ShoppingItem createShoppingItem(ShoppingItem shoppingItem) {
        return shoppingItemRepository.save(shoppingItem);
    }

    public ShoppingItem updateShoppingItem(ShoppingItem shoppingItem) {
        return shoppingItemRepository.save(shoppingItem);
    }

    public void deleteShoppingItem(int shoppingItemId) {
        shoppingItemRepository.deleteById(shoppingItemId);
    }

    public List<ShoppingItem> getShoppingItemsByGroupId(int groupId) {
        return shoppingItemRepository.getShoppingItemsByGroupId(groupId);
    }
}
