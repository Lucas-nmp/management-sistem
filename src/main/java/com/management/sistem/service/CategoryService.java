package com.management.sistem.service;

import com.management.sistem.entity.Category;
import com.management.sistem.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    
    public Category findCategoryForId(Long id) {
        Category category = categoryRepository.findById(id).orElse(null);
        return category;
    }
    
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
    
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }
}
