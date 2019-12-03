/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author antti
 */
public class Tulostin extends Thread{
    
    ArrayList<Integer> l;
    Iterator<Integer> i;
    
    public Tulostin(ArrayList<Integer> l){
        this.l = l;
    }
    
    public Tulostin(ArrayList<Integer> l, Iterator<Integer> i){
        this.l = l;
        this.i = i;
    }
    
    @Override
    public void run(){
        if (i == null) {
            l.forEach((i) -> {
                System.out.println(i);
            });
        } else {
            for (Iterator<Integer> i = this.i; i.hasNext();) {
                System.out.println(i.next());
            }
        }
    }
}
