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
public class Hesburger implements BurgerBuilder{
    
    String tilaus = "";

    public void setTilaus(String tilaus) {
        this.tilaus = tilaus;
    } 

    @Override
    public Burger getBurger() {
        return new HesenBurger(tilaus);
    }
    
}
