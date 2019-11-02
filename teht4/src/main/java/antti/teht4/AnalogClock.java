/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht4;


import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author antti
 */
public class AnalogClock implements Observer{
    
    private ClockTimer timer;
    public AnalogClock(ClockTimer ct){
        timer = ct;
        timer.addObserver(this);
    }
    
        
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        
        System.out.println("Analginen kello " + hour + ":" + minute + ":" + second);
        
    }

    @Override
    public void update(Observable arg0, Object s) {
        draw();
    }
    
}
