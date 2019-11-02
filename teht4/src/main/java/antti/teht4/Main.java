/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antti
 */
public class Main {
    
    public static void main(String[] args) {
        
        ClockTimer ct = new ClockTimer(0, 0, 0);
        DigitalClock dc = new DigitalClock(ct);
        AnalogClock analogClock = new AnalogClock(ct);
        
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
                ct.tick();
                System.out.println("--tick--");
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
