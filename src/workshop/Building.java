/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Kenneth Haahr
 */
public class Building {
    private String name;
    private String location;
    private UUID buildingId;
    
    ArrayList <Censor> censorList = new ArrayList<>();
    ArrayList <Actuator> actuatorList = new ArrayList<>();

    
    //getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public UUID getBuildingId() {
        return buildingId;
    }
    
    //constructor
    public Building(String name, String location){
        this.name = name;
        this.location = location;
        this.buildingId = UUID.randomUUID();
        
    }
    //add a censor
    public void addCensor(Censor c){
        censorList.add(c);
    }
    //add an actuator
    public void addActuator(Actuator a){
        actuatorList.add(a);
    }
        @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Buildings: ").append("\n");
        sb.append(name).append(" ").append(location).append(" ").append(buildingId);
//        sb.append("name ").append(buildingName);
        return sb.toString();
    }
    
}
