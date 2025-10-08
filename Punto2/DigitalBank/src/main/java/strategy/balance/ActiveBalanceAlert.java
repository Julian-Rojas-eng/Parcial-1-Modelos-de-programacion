/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.balance;

import strategy.BalanceAlertStrategy;
import model.User;

/**
 * Active balance alert when threshold is reached
 */
public class ActiveBalanceAlert implements BalanceAlertStrategy {
    @Override
    public void checkAndNotify(User user, double threshold) {
        if (user.getBalance() < threshold) {
            System.out.println("BALANCE ALERT - SMS");
            System.out.println("To: " + user.getPhoneNumber());
            System.out.println("LOW BALANCE ALERT!");
            System.out.println("Your balance ($" + user.getBalance() + ") is below $" + threshold);
            System.out.println("Consider adding funds to your account.");
        }
    }
}
