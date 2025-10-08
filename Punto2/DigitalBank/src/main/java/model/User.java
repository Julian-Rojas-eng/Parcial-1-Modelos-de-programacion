/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class that represents a user in the banking system
 */
public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private double balance;
    
    public User(String id, String name, String email, String phoneNumber, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public double getBalance() { return balance; }
    
    public void setBalance(double balance) { this.balance = balance; }
    
    @Override
    public String toString() {
        return String.format("User: %s | Balance: $%.2f", name, balance);
    }
}