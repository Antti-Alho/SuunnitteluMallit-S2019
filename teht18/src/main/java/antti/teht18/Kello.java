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
public class Kello implements Cloneable{
    Viisari tunnit = new Viisari(23);
    Viisari minuutit = new Viisari(59);
    Viisari sekuntit = new Viisari(59);
    
    public void tick(){
        if (sekuntit.tick()) {}
            else if (minuutit.tick()) {}
                else if (tunnit.tick()) {}
    }
    
    public void setTime(int h, int m, int s){
        tunnit.setI(h);
        minuutit.setI(m);
        sekuntit.setI(s);
    }
    
    public void print(){
        System.out.println("Aika: " + tunnit.getI() + ":" + minuutit.getI() + ":" + sekuntit.getI());
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Kello k = (Kello)super.clone(); 
  
        k.tunnit = new Viisari(tunnit.MAX);
        k.minuutit  = new Viisari(minuutit.MAX);
        k.sekuntit  = new Viisari(sekuntit.MAX);
        k.setTime(tunnit.getI(), minuutit.getI(), sekuntit.getI());

        return k; 
    }

}
