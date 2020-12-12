package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.GroceryItem;
import team2.roommates.services.GroceryItemService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GroceryItemController {
    @Autowired
    GroceryItemService service;

    @PostMapping("/api/groceryItems")
    public GroceryItem createGroceryItem(
            @RequestBody GroceryItem groceryItem
    ) {
        return service.createGroceryItem(groceryItem);
    }

    @PutMapping("/api/groceryItems")
    public GroceryItem updateGroceryItem(
            @RequestBody GroceryItem groceryItem
    ) {
        return service.updateGroceryItem(groceryItem);
    }

    @DeleteMapping("/api/groceryItems/{id}")
    public void deleteGroceryItem(
            @PathVariable int id
    ) {
        service.deleteGroceryItem(id);
    }

    @GetMapping("/api/groceryItems/{id}")
    public GroceryItem getGroceryItemById(
            @PathVariable int id
    ) {
        return service.getGroceryItemById(id);
    }

    @GetMapping("/api/apartments/{id}/groceryItems")
    public List<GroceryItem> getGroceryListByApartmentId(
            @PathVariable int id
    ) {
        return service.getGroceryItemsByApartmentId(id);
    }
}
