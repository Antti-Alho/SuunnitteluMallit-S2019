/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht4;

import java.util.Observable;

/**
 *
 * @author antti
 */
public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;

    public ClockTimer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    void tick(){
        this.second++;
        if (second >= 60) {
            this.second = 0;
            this.minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    this.hour = 0;
                }
            }
        }
        super.setChanged();
        super.notifyObservers();
    }
}
