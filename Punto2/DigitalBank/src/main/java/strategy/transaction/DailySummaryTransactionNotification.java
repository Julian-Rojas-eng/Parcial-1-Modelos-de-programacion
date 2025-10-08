/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.transaction;

import strategy.TransactionNotificationStrategy;
import model.Transaction;
import model.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Daily summary of transactions
 */
public class DailySummaryTransactionNotification implements TransactionNotificationStrategy {
    private List<Transaction> dailyTransactions = new ArrayList<>();
    
    @Override
    public void notifyTransaction(User user, Transaction transaction) {
        dailyTransactions.add(transaction);
        System.out.println("DAILY SUMMARY MODE");
        System.out.println("Transaction recorded for daily summary: " + transaction.getDescription());
    }
    
    public void sendDailySummary(User user) {
        System.out.println("DAILY SUMMARY - Email");
        System.out.println("To: " + user.getEmail());
        System.out.println("Daily Transaction Summary");
        System.out.println("Dear " + user.getName() + ",");
        System.out.println("Here's your daily activity summary:");
        for (Transaction t : dailyTransactions) {
            System.out.println("  • " + t);
        }
        System.out.println("Current Balance: $" + user.getBalance());
        dailyTransactions.clear();
    }
}