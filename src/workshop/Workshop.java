/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author Kenneth Haahr
 */
public class Workshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Building b1 = new Building("Big building", " Here");
        Building b2 = new Building ("Small building", " There");
        Censor c1 = new Censor();
        Actuator a1 = new Actuator();
        Censor c2 = new Censor();
        Actuator a2 = new Actuator();
        b1.addCensor(c1);
        b1.addActuator(a1);
        b2.addCensor(c2);
        b2.addActuator(a2);
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
    
}
