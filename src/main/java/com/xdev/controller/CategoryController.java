package com.xdev.controller;

import com.xdev.entity.Category;
import com.xdev.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("category", new Category());
        return "/category/index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addCategory(@ModelAttribute("category") @Valid Category category, BindingResult rs) {
        if (rs.hasErrors()) {
            return "/category/index";
        }
        categoryService.insert(category);
        return "/category/index";
    }
}
