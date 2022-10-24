package com.xdev.service;

import com.xdev.entity.Category;
import com.xdev.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public void insert(Category category) {
        categoryRepository.save(category);
    }


    public Category findBySlug(String slug) {
        return categoryRepository.findBySlug(slug).orElse(null);
    }
}
