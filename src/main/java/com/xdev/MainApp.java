package com.xdev;

import com.xdev.config.ApplicationContextConfig;
import com.xdev.entity.Category;
import com.xdev.service.CategoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        CategoryService service = (CategoryService) context.getBean("categoryService");
        /*Category category = new Category();
        category.setSlug("hello-world");
        category.setTitle("Hello world");
        service.insert(category);*/
        Category category = service.findBySlug("hello-world");
        if (category != null) {
            System.out.println(category);
        }
    }
}
