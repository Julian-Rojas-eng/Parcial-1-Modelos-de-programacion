/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import model.User;
import model.Promotion;

/**
 * Strategy Interface for promotion notifications
 */
public interface PromotionNotificationStrategy {
    void notifyPromotion(User user, Promotion promotion);
}