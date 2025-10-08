/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.balance;

import strategy.BalanceAlertStrategy;
import model.User;

/**
 * No balance alerts
 */
public class NoBalanceAlert implements BalanceAlertStrategy {
    @Override
    public void checkAndNotify(User user, double threshold) {
        
        // User prefers no balance alerts
        System.out.println("NO BALANCE ALERT]");
        System.out.println("User " + user.getName() + " has disabled balance alerts.");
    }
}
