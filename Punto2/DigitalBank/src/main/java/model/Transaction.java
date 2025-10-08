/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class that represents a bank transaction
 */
public class Transaction {
    private String type;
    private double amount;
    private String description;
    private String timestamp;
    
    public Transaction(String type, double amount, String description, String timestamp) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.timestamp = timestamp;
    }
    
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public String getTimestamp() { return timestamp; }
    
    @Override
    public String toString() {
        return String.format("%s - $%.2f - %s [%s]", type, amount, description, timestamp);
    }
}