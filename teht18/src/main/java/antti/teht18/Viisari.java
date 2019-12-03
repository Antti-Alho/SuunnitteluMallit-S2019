/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht18;

/**
 *
 * @author antti
 */
public class Viisari {
    final int MAX;
    int i;
    
    Viisari(int i) {
        this.MAX = i;
        this.i = 0;
    }
    
    public boolean tick(){
        if (i < MAX) {
            i++;
            return true;
        } else {
            i = 0;
            return false;
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getMAX() {
        return MAX;
    }
    
}
