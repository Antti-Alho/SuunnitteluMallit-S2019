/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht15;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        Tulostin tulostin = new Tulostin();
        Tulostettava tulostettava = new Tulostettava("asd");
        
        if (tulostin.tulosta(tulostettava)) {
            System.out.println("Round peg fits round hole.");
        }
        
        EiTulostettava tulostettava2 = new EiTulostettava(2);
        /**
         * EI TOIMI
         * if (tulostin.tulosta(tulostettava2)) {
         *    System.out.println("Square peg does not fit a round hole.");
         *}
         * 
         **/
        
        if (tulostin.tulosta(new IntAdapter(tulostettava2))) {
            System.out.println("Square peg fits a round hole");
        }

    }
}
