package com.example.todoApp.controller;

import com.example.todoApp.model.Category;
import com.example.todoApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class CategoryController {
    private CategoryService categoryService;
    @Autowired
    public void setCategoryService(CategoryService categoryService){
        this.categoryService=categoryService;}

   @PostMapping("/categories")
        public Category createCategory(@RequestBody Category categoryObject){
            return categoryService.createCategory(categoryObject);
        }
        @GetMapping("/categories")
    public List<Category>getCategories(){
        return categoryService.getCategories();
        }
        @GetMapping("/categories/{categoryId}")
    public  Optional<Category>getCategory(@PathVariable Long categoryId){
        return categoryService.getCategory(categoryId);
        }
    @PutMapping("/categories/{categoryId}")
    public Category updateCategory(@PathVariable Long categoryId, @RequestBody Category categoryObject) {
        return categoryService.updateCategory(categoryId, categoryObject);
    }
    @DeleteMapping("/categories/{categoryId}")
    public void deletecategory(@PathVariable Long categoryId) {
        categoryService.deletecategory(categoryId);
    }


    }

