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
public class Actuator {

    private UUID actuatorId;
    private boolean actuatorValue;

    public UUID getActuatorId() {
        return actuatorId;
    }

    public boolean isActuatorValue() {
        return actuatorValue;
    }

    public void setActuatorValue(Censor c) {
        actuatorValue = c.getValue() > 51;
    }

}
