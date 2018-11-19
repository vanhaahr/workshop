/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.UUID;

/**
 *
 * @author Kenneth Haahr
 */
public class Censor {

    private UUID censorId = UUID.randomUUID();
    private double censorValue = Math.random() * 100;

    public Censor() {
        
    }


    public double getValue() {
        return censorValue;

    }
   
}
