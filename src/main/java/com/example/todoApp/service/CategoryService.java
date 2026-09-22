package com.example.todoApp.service;

import com.example.todoApp.model.Category;
import com.example.todoApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.todoApp.model.Category;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    public Category createCategory(Category categoryObject){
        return categoryRepository.save(categoryObject);
    }
    public List<Category>getCategories(){
        return categoryRepository.findAll();
    }
    public Optional<Category>getCategory(Long categoryId){
        return categoryRepository.findById(categoryId);
    }
    public  Category updateCategory (Long categoryId,  Category  categoryObject){
        Category  category=  categoryRepository.findById(categoryId).get();
        category.setName((categoryObject.getName()));
        category.setDescription(categoryObject.getDescription());
        return categoryRepository.save(category);
    }
    public void  deletecategory(Long categoryId){
        categoryRepository.deleteById(categoryId);
    }
}
