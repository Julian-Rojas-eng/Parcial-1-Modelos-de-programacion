/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import model.Transaction;
import model.User;

/**
 * Strategy Interface for transaction notifications
 */
public interface TransactionNotificationStrategy {
    void notifyTransaction(User user, Transaction transaction);
}