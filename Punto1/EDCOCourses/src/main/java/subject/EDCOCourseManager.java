/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

import observer.Observer;
import model.Course;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject Class (Observable) EDCO Course Manager
 */
public class EDCOCourseManager {
    private List<Observer> observers;
    private List<Course> courses;
    
    public EDCOCourseManager() {
        this.observers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    // Methods to manage observers
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("New subscriber added to the system");
    }
    
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Subscriber removed from the system");
    }
    
    private void notifyObservers(String changeType, Course course) {
        for (Observer observer : observers) {
            observer.update(changeType, course);
        }
    }
    
    // Course operations
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("NEW COURSE ADDED");
        notifyObservers("NEW", course);
    }
    
    public void modifyCourse(String courseName, String newDescription, double newPrice) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.setDescription(newDescription);
                course.setPrice(newPrice);
                System.out.println("COURSE MODIFIED");
                notifyObservers("MODIFIED", course);
                return;
            }
        }
    }
    
    public void removeCourse(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                courses.remove(course);
                System.out.println("COURSE REMOVED");
                notifyObservers("REMOVED", course);
                return;
            }
        }
    }
}