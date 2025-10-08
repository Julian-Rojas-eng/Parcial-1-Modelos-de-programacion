/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import model.Course;

/**
 * Observer Interface that defines the contract for observers
 */
public interface Observer {
    void update(String changeType, Course course);
}