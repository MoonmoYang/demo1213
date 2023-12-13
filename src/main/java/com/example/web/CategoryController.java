package com.example.web;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CategoryController {

    public void getCategoryById(int id) {
    }
    public String getCategoryNameById(int id) {
        return categoryName;
    }
    private String categoryName;

    public void printCategoryName() {
        System.out.println(categoryName);
    }

    private int categoryId;

    public void printCategoryId() {
        System.out.println(categoryId);
    }
    public void printCategoryDetails() {
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
    }

}
