package org.tanzu.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.concurrent.ThreadLocalRandom;


@Entity
public class Sensor {

    @Id
    @GeneratedValue
    int id;
    String role;
    String mood;
    String baseline;

    public Sensor() {
        
        this.role = generateRole();
        this.mood = generateMood();
        this.baseline = generateBaseline();
    }

    public Sensor(String role, String mood, String baseline) {
        this.role = role;
        this.mood = mood;
        this.baseline = baseline;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getMood() {
        return mood;
    }

    public String getBaseline() {
        return baseline;
    }
    
    private String generateRole() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "architect";
            case 2:
                return "developer";
            case 3:
                return "app operator";
            case 4:
                return "platform operator";
            default:
                return "error!!";
        }
    }

    private String generateMood() {

        int rand = ThreadLocalRandom.current().nextInt(1, 4);
        switch(rand) {
            case 1:
                return "happy";
            case 2:
                return "sad";
            case 3:
                return "angry";
            default:
                return "error!!";
        }
    }

    private String generateBaseline() {

        int rand = ThreadLocalRandom.current().nextInt(1, 11);

        if (rand < 8) {
                return "";
        }
        switch(rand) {
            case 8:
                return "Predicting social issues";
            case 9:
                return "Existing medical conditions";
            case 10:
                return "Existing medical conditions, Predicting social issues";
            default:
                return "error!!";
        }
    }
}
