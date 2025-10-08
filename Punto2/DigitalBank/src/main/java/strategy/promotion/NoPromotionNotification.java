/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.promotion;

import strategy.PromotionNotificationStrategy;
import model.User;
import model.Promotion;

/**
 * No promotion notifications
 */
public class NoPromotionNotification implements PromotionNotificationStrategy {
    @Override
    public void notifyPromotion(User user, Promotion promotion) {
        System.out.println("NO PROMOTION NOTIFICATION");
        System.out.println("User " + user.getName() + " has opted out of promotional offers.");
    }
}
