/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import subject.EDCOCourseManager;
import model.Course;
import observer.Webmaster;
import observer.Journalist;
import observer.CommunityManager;
import java.util.List;

/**
 * Main Class  EDCO Notification System
 */
public class EDCONotificationSystem {
    public static void main(String[] args) {
        System.out.println("EDCO NOTIFICATION SYSTEM");
        System.out.println("Universidad Central de Oriente");
        
        // Create the course manager
        EDCOCourseManager edcoManager = new EDCOCourseManager();
        
        // Create observers
        Webmaster andrea = new Webmaster("Andrea Mahecha");
        Journalist luzDary = new Journalist("Luz Dary Varela", "Teachers and Learning");
        CommunityManager laura = new CommunityManager("Laura Molano", 
            List.of("Instagram", "TikTok", "Facebook"));
        
        // Subscribe observers
        System.out.println("USER SUBSCRIPTION: ");
        edcoManager.subscribe(andrea);
        edcoManager.subscribe(luzDary);
        edcoManager.subscribe(laura);
        
        // Simulate operations
        System.out.println("SYSTEM OPERATIONS");
        
        // Add new course
        Course course1 = new Course(
            "AI Applied to Education",
            "Learn to integrate AI tools in the classroom",
            "Educational Technology",
            450000
        );
        edcoManager.addCourse(course1);
        
        System.out.println("\n" + "=".repeat(50));
        
        // Add another course
        Course course2 = new Course(
            "Decolonial Pedagogy",
            "Critical approaches for transformative education",
            "Pedagogy",
            380000
        );
        edcoManager.addCourse(course2);
        
        System.out.println("\n" + "=".repeat(50));
        
        // Modify course
        edcoManager.modifyCourse(
            "AI Applied to Education",
            "Learn to integrate AI tools in the classroom - SPECIAL OFFER!",
            399000
        );
        
        System.out.println("\n" + "=".repeat(50));
        
        // Remove course
        edcoManager.removeCourse("Decolonial Pedagogy");
    }
}