/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht3;
import java.util.ArrayList;

/**
 *
 * @author antti
 */
public class Komponentti implements Laiteosa{
    
    int hinta;
    
    public Komponentti(int hinta){
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }

}
