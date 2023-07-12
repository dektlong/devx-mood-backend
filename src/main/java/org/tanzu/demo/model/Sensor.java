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

        int rand = ThreadLocalRandom.current().nextInt(1, 19);
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

        int rand = ThreadLocalRandom.current().nextInt(1, 21);

        switch(rand) {
            case 1:
                return "";
            case 2:
                return "";
            case 3:
                return "";
            case 4:
                return "";
            case 5:
                return "";
            case 6:
                return "";
            case 7:
                return "";
            case 8:
                return "";
            case 9:
                return "";
            case 10:
                return "Predicting neutral social sentiments";
            case 11:
                return "Predicting positive social sentiments";
            case 12:
                return "Predicting negative social sentiments";            
            case 13:
                return "Predicting mixed social sentiments";
            case 14:
                return "Medical conditions found";
            case 15:
                return "Medical conditions found, Predicting neutral social sentiments";
            case 16:
                return "Medical conditions found, Predicting positive social sentiments";
            case 17:
                return "Medical conditions found, Predicting negative social sentiments";
            case 18:
                return "Medical conditions found, Predicting mixed social sentiments";
            default:
                return "error!!";
        }
    }
}
