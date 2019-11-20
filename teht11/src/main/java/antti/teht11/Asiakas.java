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
    private Memento m;
    private Arvuuttaja a;
    private String nimi;
    
    public Asiakas(Arvuuttaja a, String nimi){
        this.a = a;
        this.nimi = nimi;
    }

    public void addMemento(Memento m) {
        this.m = m;
    }

    public Memento getMemento() {
        return m;
    }
    
    @Override
    public void run(){
        while (!a.arvaus(this, r.nextInt(1000))){
            System.out.println(nimi+" arvasi VÄÄRIN!");
        }
        System.out.println(nimi+" arvasi OIKEIN!");
    }
}
