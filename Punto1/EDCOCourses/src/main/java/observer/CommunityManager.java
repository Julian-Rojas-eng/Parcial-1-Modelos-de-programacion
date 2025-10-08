/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import model.Course;
import java.util.List;

/**
 * Concrete Observer Community Manager
 */
public class CommunityManager implements Observer {
    private String name;
    private List<String> socialNetworks;
    
    public CommunityManager(String name, List<String> socialNetworks) {
        this.name = name;
        this.socialNetworks = socialNetworks;
    }
    
    @Override
    public void update(String changeType, Course course) {
        System.out.println("COMMUNITY MANAGER - " + name + "");
        switch(changeType) {
            case "NEW":
                System.out.println("  Creating posts for: " + course.getName());
                for (String network : socialNetworks) {
                    System.out.println("    • Post on " + network + " scheduled");
                }
                System.out.println("  Designing promotional graphics");
                break;
            case "MODIFIED":
                System.out.println("  Updating posts for course: " + course.getName());
                System.out.println("  New information in stories");
                break;
            case "REMOVED":
                System.out.println("  Deleting posts for course: " + course.getName());
                System.out.println("  Unpublishing content on networks");
                break;
        }
    }
}