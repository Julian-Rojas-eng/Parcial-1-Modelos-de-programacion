/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.promotion;

import strategy.PromotionNotificationStrategy;
import model.User;
import model.Promotion;

/**
 * SMS promotion notifications
 */
public class SMSPromotionNotification implements PromotionNotificationStrategy {
    @Override
    public void notifyPromotion(User user, Promotion promotion) {
        System.out.println("PROMOTION - SMS");
        System.out.println("To: " + user.getPhoneNumber());
        System.out.println("  " + promotion.getTitle());
        System.out.println("  " + promotion.getDiscountPercentage() + "% OFF");
        System.out.println("Valid until: " + promotion.getValidUntil());
    }
}
