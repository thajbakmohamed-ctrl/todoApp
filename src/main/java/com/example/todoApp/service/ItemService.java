package com.example.todoApp.service;

import com.example.todoApp.model.Category;
import com.example.todoApp.repository.CategoryRepository;
import com.example.todoApp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.todoApp.model.Category;
import com.example.todoApp.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemService {
    private ItemRepository itemRepository;
    private CategoryRepository categoryRepository;
    @Autowired
    public void setItemRepository(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    public Item creatItem(Long categoryId,Item itemObject){
        Category category= categoryRepository.findById(categoryId).get();
        itemObject.setCategory(category);
        return itemRepository.save(itemObject);
    }
    public List<Item> getItems (Long categoryId){
        return itemRepository.findAll().stream().
        filter(item -> item.getCategory().getId()
                .equals(categoryId)).toList();
    }
    public Optional<Item>getItem (Long categoryId,Long itemId){
        return itemRepository.findById(itemId).filter(item -> item.getCategory()
                .getId().equals(categoryId));
    }
    public Item updateItem (Long categoryId , Long iteamId , Item itemObject){
        Item item = itemRepository.findById(iteamId).get();
        item.setName(itemObject.getName());
        item.setDescription(itemObject.getDescription());
        item.setDueDate(itemObject.getDueDate());
        return itemRepository.save(item);
    }
    public void deleteItem(Long categoryId, Long itemId){
        itemRepository.deleteById(itemId);
    }
}
