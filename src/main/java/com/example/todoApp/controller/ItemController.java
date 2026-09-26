package com.example.todoApp.controller;

import com.example.todoApp.model.Item;
import com.example.todoApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ItemController {
    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService){
        this.itemService= itemService;
    }
    @PostMapping("/categories/{categoryId}/items")
    public Item createItem(@PathVariable Long categoryId, @RequestBody Item itemobject){
        return itemService.creatItem(categoryId,itemobject);
    }
    @GetMapping("/categories/{categoryId}/items")
    public List<Item> getItems (@PathVariable Long categoryId){
        return itemService.getItems(categoryId);
    }
    @GetMapping("/categories/{categoryId}/items/{itemId}")
    public Optional<Item> getItem(@PathVariable Long categoryId,@PathVariable Long itemId){
        return itemService.getItem(categoryId,itemId);
    }
    @PutMapping("/categories/{categoryId}/items/{itemId}")
    public Item updateItem(@PathVariable Long categoryId,@PathVariable Long itemId,
                           @RequestBody Item itemobject){
        return  itemService.updateItem(categoryId,itemId,itemobject);
    }
    @DeleteMapping("/categories/{categoryId}/items/{itemId}")
    public void deleteItem(@PathVariable Long categoryId,
                           @PathVariable Long itemId) {
        itemService.deleteItem(categoryId, itemId);
    }
}
