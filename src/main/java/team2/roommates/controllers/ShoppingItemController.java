package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.ShoppingItem;
import team2.roommates.services.ShoppingItemService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ShoppingItemController {
    @Autowired
    ShoppingItemService shoppingItemService;

    @PostMapping("/api/shoppingItems")
    public ShoppingItem createShoppingItem(
            @RequestBody ShoppingItem shoppingItem
    ) {
        return shoppingItemService.createShoppingItem(shoppingItem);
    }

    @PutMapping("/api/shoppingItems")
    public ShoppingItem updateShoppingItem(
            @RequestBody ShoppingItem shoppingItem
    ) {
        return shoppingItemService.updateShoppingItem(shoppingItem);
    }

    @DeleteMapping("/api/shoppingItems/{shoppingItemId}")
    public void deleteShoppingItem(
            @PathVariable int shoppingItemId
    ) {
        shoppingItemService.deleteShoppingItem(shoppingItemId);
    }

    @GetMapping("/api/groups/{groupId}/shoppingItems")
    public List<ShoppingItem> getShoppingItemsByGroupId(
            @PathVariable int groupId
    ) {
        return shoppingItemService.getShoppingItemsByGroupId(groupId);
    }
}
