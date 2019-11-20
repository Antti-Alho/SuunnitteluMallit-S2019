/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht11;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author antti
 */
public class Arvuuttaja {
    private Random r = new Random();
    
    public void liityPeliin(Asiakas a){
        a.addMemento(new Memento(r.nextInt(1000)));
    }
    
    public boolean arvaus(Asiakas a, int arvaus){
        return a.getMemento().getNumber() == arvaus;
    }
}
