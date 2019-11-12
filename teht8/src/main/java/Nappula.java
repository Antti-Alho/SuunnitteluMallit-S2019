/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class Nappula {
    public String nimi;
    public int x,y;
    public int pelaaja;
    
    public Nappula(String nimi, int x, int y, int pelaaja) {
        this.nimi = nimi;
        this.x = x;
        this.y = y;
        this.pelaaja = pelaaja;
    }
    
    @Override
    public String toString(){
        return nimi;
    }
}
