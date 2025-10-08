/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.transaction;

import strategy.TransactionNotificationStrategy;
import model.Transaction;
import model.User;

/**
 * Instant notification for each transaction
 */
public class InstantTransactionNotification implements TransactionNotificationStrategy {
    @Override
    public void notifyTransaction(User user, Transaction transaction) {
        System.out.println("INSTANT NOTIFICATION - Push");
        System.out.println("To: " + user.getName());
        System.out.println("Transaction Alert!");
        System.out.println("   " + transaction);
        System.out.println("Current Balance: $" + user.getBalance());
    }
}
