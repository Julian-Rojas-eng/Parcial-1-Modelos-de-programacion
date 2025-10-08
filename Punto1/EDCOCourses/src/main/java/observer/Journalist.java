/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import model.Course;

/**
 * Concrete Observer Journalist
 */
public class Journalist implements Observer {
    private String name;
    private String program;
    
    public Journalist(String name, String program) {
        this.name = name;
        this.program = program;
    }
    
    @Override
    public void update(String changeType, Course course) {
        System.out.println("JOURNALIST - " + name + " | Program: " + program + "");
        switch(changeType) {
            case "NEW":
                System.out.println("  Preparing advertising spot for: " + course.getName());
                System.out.println("  Scheduling broadcast in prime time");
                break;
            case "MODIFIED":
                System.out.println("  Updating spot information for course: " + course.getName());
                break;
            case "REMOVED":
                System.out.println("  Removing advertising spot for: " + course.getName());
                break;
        }
    }
}