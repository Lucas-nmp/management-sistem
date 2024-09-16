package com.management.sistem;

import com.management.sistem.entity.Category;
import com.management.sistem.service.CategoryService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8081/sistem/category/
@RequestMapping("sistem/")
@CrossOrigin(value = "http://localhost:3000")
public class CategoryController {
    
    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/category")
    public List<Category> getCategories() {
        var categories = categoryService.getAllCategories();
        categories.forEach((categori -> logger.info(categori.toString())));
        return categories;
        
    }
    
    
    
}
