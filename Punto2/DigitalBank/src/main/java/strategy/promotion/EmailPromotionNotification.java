/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.promotion;

import strategy.PromotionNotificationStrategy;
import model.User;
import model.Promotion;

/**
 * Email promotion notifications
 */
public class EmailPromotionNotification implements PromotionNotificationStrategy {
    @Override
    public void notifyPromotion(User user, Promotion promotion) {
        System.out.println("PROMOTION - Email");
        System.out.println("To: " + user.getEmail());
        System.out.println("Special Offer for You!");
        System.out.println("Dear " + user.getName() + ",");
        System.out.println(promotion);
        System.out.println(promotion.getDescription());
        System.out.println("Don't miss out on this amazing deal!");
    }
}
