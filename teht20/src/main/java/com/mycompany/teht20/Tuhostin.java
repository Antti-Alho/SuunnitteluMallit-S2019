/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht20;

import java.util.ArrayList;

/**
 *
 * @author antti
 */
class Tuhostin extends Thread{
        
    ArrayList<Integer> l;
    
    public Tuhostin(ArrayList<Integer> l){
        this.l = l;
    }
    
    @Override
    public void run(){
        l.forEach((i) -> {
            l.add(100);
        });
    }
}
