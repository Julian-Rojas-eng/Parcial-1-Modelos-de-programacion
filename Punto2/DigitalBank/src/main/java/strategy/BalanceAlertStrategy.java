/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import model.User;

/**
 * Strategy Interface for balance alerts
 */
public interface BalanceAlertStrategy {
    void checkAndNotify(User user, double threshold);
}
