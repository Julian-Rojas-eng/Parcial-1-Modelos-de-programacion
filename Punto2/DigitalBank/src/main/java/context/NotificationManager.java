/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import strategy.*;
import model.*;

/**
 * Context class that manages user notification preferences
 */
public class NotificationManager {
    private User user;
    private TransactionNotificationStrategy transactionStrategy;
    private BalanceAlertStrategy balanceStrategy;
    private PromotionNotificationStrategy promotionStrategy;
    private double balanceThreshold;
    
    public NotificationManager(User user) {
        this.user = user;
        this.balanceThreshold = 50000; // Default 
    }
    
    // Strategy setters
    public void setTransactionStrategy(TransactionNotificationStrategy strategy) {
        this.transactionStrategy = strategy;
        System.out.println("Transaction notification preference updated for " + user.getName());
    }
    
    public void setBalanceStrategy(BalanceAlertStrategy strategy) {
        this.balanceStrategy = strategy;
        System.out.println("Balance alert preference updated for " + user.getName());
    }
    
    public void setPromotionStrategy(PromotionNotificationStrategy strategy) {
        this.promotionStrategy = strategy;
        System.out.println("Promotion notification preference updated for " + user.getName());
    }
    
    public void setBalanceThreshold(double threshold) {
        this.balanceThreshold = threshold;
    }
    
    // Notification methods
    public void notifyTransaction(Transaction transaction) {
        if (transactionStrategy != null) {
            transactionStrategy.notifyTransaction(user, transaction);
        }
    }
    
    public void checkBalanceAlert() {
        if (balanceStrategy != null) {
            balanceStrategy.checkAndNotify(user, balanceThreshold);
        }
    }
    
    public void notifyPromotion(Promotion promotion) {
        if (promotionStrategy != null) {
            promotionStrategy.notifyPromotion(user, promotion);
        }
    }
    
    public User getUser() {
        return user;
    }
}