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
 * Weekly summary of transactions
 */
public class WeeklySummaryTransactionNotification implements TransactionNotificationStrategy {
    private List<Transaction> weeklyTransactions = new ArrayList<>();
    
    @Override
    public void notifyTransaction(User user, Transaction transaction) {
        weeklyTransactions.add(transaction);
        System.out.println("WEEKLY SUMMARY MODE");
        System.out.println("Transaction recorded for weekly summary: " + transaction.getDescription());
    }
    
    public void sendWeeklySummary(User user) {
        System.out.println("WEEKLY SUMMARY - Email");
        System.out.println("To: " + user.getEmail());
        System.out.println("Weekly Transaction Report");
        System.out.println("Dear " + user.getName() + ",");
        System.out.println("Here's your weekly activity report:");
        
        double totalDeposits = 0;
        double totalWithdrawals = 0;
        
        for (Transaction t : weeklyTransactions) {
            System.out.println("  • " + t);
            if (t.getType().equals("DEPOSIT") || t.getType().equals("TRANSFER IN")) {
                totalDeposits += t.getAmount();
            } else {
                totalWithdrawals += t.getAmount();
            }
        }
        
        System.out.println("Weekly Summary:");
        System.out.println("  Total Deposits: $" + totalDeposits);
        System.out.println("  Total Withdrawals: $" + totalWithdrawals);
        System.out.println("  Current Balance: $" + user.getBalance());
        weeklyTransactions.clear();
    }
}
