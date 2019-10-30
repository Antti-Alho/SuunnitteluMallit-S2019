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
public class KoosteKomponentti extends Komponentti implements Laiteosa{
    ArrayList<Laiteosa> osat;
    
    public KoosteKomponentti(int a){
        super(a);
        osat = new ArrayList<>();
    }
    
    @Override
    public int getHinta(){
        int r = super.hinta;
        for (Laiteosa laiteosa : osat) {
            r = r + laiteosa.getHinta();
        }
        return r;
    }
    
    public void addOsa(Laiteosa a){
        osat.add(a);
    }
}
