/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht11;

import java.util.Random;

/**
 *
 * @author antti
 */
class Asiakas extends Thread{
    private Random r = new Random();
    private Object m;
    private Arvuuttaja a;
    private String nimi;
    
    private static boolean arpokaa = true;
    
    public Asiakas(Arvuuttaja a, String nimi){
        this.a = a;
        this.nimi = nimi;
    }

    public void addMemento(Object m) {
        this.m = m;
    }

    public Object getMemento() {
        return m;
    }
    
    @Override
    public void run(){
        while (!a.arvaus(this, r.nextInt(1000)) && Asiakas.arpokaa){
            System.out.println(nimi+" arvasi VÄÄRIN!");
        }
        if (Asiakas.arpokaa == false){
            return;
        }
        Asiakas.arpokaa = false;
        System.out.println(nimi+" arvasi OIKEIN!");
        
    }
}
