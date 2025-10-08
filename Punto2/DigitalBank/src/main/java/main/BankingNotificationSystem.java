/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import context.NotificationManager;
import model.*;
import strategy.transaction.*;
import strategy.balance.*;
import strategy.promotion.*;

/**
 * Main class, Represents Digital Banking Notification System
 */
public class BankingNotificationSystem {
    public static void main(String[] args) {
        System.out.println("DIGITAL BANKING NOTIFICATION SYSTEM");
        
        // Create users
        User user1 = new User("001", "Carlos Mendez", "carlos@email.com", "+57-300-1234567", 150000);
        User user2 = new User("002", "Ana Rodriguez", "ana@email.com", "+57-301-7654321", 45000);
        User user3 = new User("003", "Luis Torres", "luis@email.com", "+57-302-9876543", 200000);
        
        // Create notification managers
        NotificationManager manager1 = new NotificationManager(user1);
        NotificationManager manager2 = new NotificationManager(user2);
        NotificationManager manager3 = new NotificationManager(user3);
        
        System.out.println("SETTING USER PREFERENCES");
        
        //User 1: Instant notifications, active balance alerts, email promotions
        System.out.println("User 1 - " + user1.getName() + " preferences:");
        manager1.setTransactionStrategy(new InstantTransactionNotification());
        manager1.setBalanceStrategy(new ActiveBalanceAlert());
        manager1.setPromotionStrategy(new EmailPromotionNotification());
        manager1.setBalanceThreshold(100000);
        
        System.out.println("User 2 - " + user2.getName() + " preferences:");
        //User 2: Daily summary, active balance alerts, SMS promotions
        DailySummaryTransactionNotification dailySummary = new DailySummaryTransactionNotification();
        manager2.setTransactionStrategy(dailySummary);
        manager2.setBalanceStrategy(new ActiveBalanceAlert());
        manager2.setPromotionStrategy(new SMSPromotionNotification());
        manager2.setBalanceThreshold(50000);
        
        System.out.println("User 3 - " + user3.getName() + " preferences:");
        //User 3: Weekly summary, no balance alerts, no promotions
        WeeklySummaryTransactionNotification weeklySummary = new WeeklySummaryTransactionNotification();
        manager3.setTransactionStrategy(weeklySummary);
        manager3.setBalanceStrategy(new NoBalanceAlert());
        manager3.setPromotionStrategy(new NoPromotionNotification());
        
        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("SIMULATING TRANSACTIONS");
        System.out.println("=".repeat(60));
        
        // User 1 makes a transaction
        Transaction t1 = new Transaction("TRANSFER OUT", 25000, "Payment to John", "2025-10-08 10:30");
        user1.setBalance(user1.getBalance() - t1.getAmount());
        manager1.notifyTransaction(t1);
        
        // User 2 makes multiple transactions
        Transaction t2 = new Transaction("DEPOSIT", 10000, "Salary deposit", "2025-10-08 09:00");
        user2.setBalance(user2.getBalance() + t2.getAmount());
        manager2.notifyTransaction(t2);
        
        Transaction t3 = new Transaction("PURCHASE", 15000, "Grocery shopping", "2025-10-08 14:20");
        user2.setBalance(user2.getBalance() - t3.getAmount());
        manager2.notifyTransaction(t3);
        
        // User 3 makes transactions
        Transaction t4 = new Transaction("TRANSFER IN", 50000, "Payment received", "2025-10-08 11:45");
        user3.setBalance(user3.getBalance() + t4.getAmount());
        manager3.notifyTransaction(t4);
        
        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("CHECKING BALANCE ALERTS");
        System.out.println("=".repeat(60));
        
        manager1.checkBalanceAlert();
        manager2.checkBalanceAlert();
        manager3.checkBalanceAlert();
        
        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("SENDING PROMOTIONS");
        System.out.println("=".repeat(60));
        
        Promotion promo = new Promotion(
            "Flash Sale - Phone Top-up",
            "Get 20% bonus on all phone top-ups this weekend!",
            "2025-10-10",
            20
        );
        
        manager1.notifyPromotion(promo);
        manager2.notifyPromotion(promo);
        manager3.notifyPromotion(promo);
        
        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("SENDING SUMMARIES");
        System.out.println("=".repeat(60));
        
        // Send daily summary for user 2
        dailySummary.sendDailySummary(user2);
        
        // Send weekly summary for user 3
        weeklySummary.sendWeeklySummary(user3);
        
        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("CHANGING USER PREFERENCES");
        System.out.println("=".repeat(60));
        
        System.out.println("User 1 changes to weekly summary notifications:");
        manager1.setTransactionStrategy(new WeeklySummaryTransactionNotification());
        
        System.out.println("User 2 disables balance alerts:");
        manager2.setBalanceStrategy(new NoBalanceAlert());
    }
}