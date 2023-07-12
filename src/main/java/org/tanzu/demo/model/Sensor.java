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

        int rand = ThreadLocalRandom.current().nextInt(1, 24);

        if (rand < 15) {
            return "";
        }

        switch(rand) {
            case 15:
                return "Predicting neutral social sentiments";
            case 16:
                return "Predicting positive social sentiments";
            case 17:
                return "Predicting negative social sentiments";            
            case 18:
                return "Predicting mixed social sentiments";
            case 19:
                return "Medical conditions found";
            case 20:
                return "Medical conditions found, Predicting neutral social sentiments";
            case 21:
                return "Medical conditions found, Predicting positive social sentiments";
            case 22:
                return "Medical conditions found, Predicting negative social sentiments";
            case 23:
                return "Medical conditions found, Predicting mixed social sentiments";
            default:
                return "error!!";
        }
    }
}
