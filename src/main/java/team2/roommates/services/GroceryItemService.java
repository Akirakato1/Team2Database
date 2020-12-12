package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.GroceryItem;
import team2.roommates.models.ShoppingItem;
import team2.roommates.repositories.GroceryItemRepository;

import java.util.List;

@Service
public class GroceryItemService {
    @Autowired
    GroceryItemRepository repository;

    public GroceryItem createGroceryItem(GroceryItem groceryItem) {
        return repository.save(groceryItem);
    }

    public GroceryItem updateGroceryItem(GroceryItem groceryItem) {
        return repository.save(groceryItem);
    }

    public void deleteGroceryItem(int id) {
        repository.deleteById(id);
    }

    public GroceryItem getGroceryItemById(int id) {
        return repository.findById(id).get();
    }

    public List<GroceryItem> getGroceryItemsByApartmentId(int id) {
        return repository.getGroceryItemsByApartmentId(id);
    }
}
