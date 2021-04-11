/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author Aci Chaerul Kafi
 */
public class Bicycle {
    int brake = 0;
    int speed = 0;
    int gear = 1;

    public void changeBrake(int newValue) {
         brake = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("brake:" +
             brake + " speed:" + 
             speed + " gear:" + gear);
    }
}