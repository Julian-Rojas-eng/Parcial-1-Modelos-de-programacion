/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class that represents a promotional offer
 */
public class Promotion {
    private String title;
    private String description;
    private String validUntil;
    private int discountPercentage;
    
    public Promotion(String title, String description, String validUntil, int discountPercentage) {
        this.title = title;
        this.description = description;
        this.validUntil = validUntil;
        this.discountPercentage = discountPercentage;
    }
    
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getValidUntil() { return validUntil; }
    public int getDiscountPercentage() { return discountPercentage; }
    
    @Override
    public String toString() {
        return String.format("%s - %d%% OFF - Valid until: %s", title, discountPercentage, validUntil);
    }
}