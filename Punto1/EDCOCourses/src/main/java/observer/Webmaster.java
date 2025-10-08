/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import model.Course;

/**
 * Concrete Observer Webmaster
 */
public class Webmaster implements Observer {
    private String name;
    
    public Webmaster(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String changeType, Course course) {
        System.out.println("WEBMASTER - " + name + "");
        switch(changeType) {
            case "NEW":
                System.out.println("  Updating website with new course: " + course.getName());
                System.out.println("  Creating new page for: " + course.getCategory());
                break;
            case "MODIFIED":
                System.out.println("  Updating course information: " + course.getName());
                System.out.println("  Price updated: $" + course.getPrice());
                break;
            case "REMOVED":
                System.out.println("  Removing course page: " + course.getName());
                System.out.println("  Updating navigation menu");
                break;
        }
    }
}