/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author Kenneth Haahr
 */
public class BuildingDatabase {
    
    HashMap <UUID,Building> buildings = new HashMap<>();
    
    public void addBuilding (Building b){
        buildings.put(b.getBuildingId(),b);
        
    }

}
