/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class that represents an EDCO course
 */
public class Course {
    private String name;
    private String description;
    private String category;
    private double price;

    
    public Course(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }
    
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    
    public void setDescription(String description) { this.description = description; }
    public void setPrice(double price) { this.price = price; }
    
    @Override
    public String toString() {
        return String.format("Course: %s | Category: %s | Price: $%.2f", 
                           name, category, price);
    }
}
