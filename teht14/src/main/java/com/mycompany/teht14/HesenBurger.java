/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht14;

/**
 *
 * @author antti
 */
public class HesenBurger implements Burger {
    
    String nimi;

    public HesenBurger(String s) {
        nimi = s;
    }

    HesenBurger() {
    }

    @Override
    public String tulostaSisältö() {
        return nimi;
    }
    
}
