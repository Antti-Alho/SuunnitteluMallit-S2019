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
public class Main {
    public static void main(String[] args) {
        Hesburger h = new Hesburger();
        h.setTilaus("megaburgr");
        Burger burger = h.getBurger();
        System.out.println(burger.tulostaSisältö());
        Burger burger2 = new McDonalds().getBurger();
        System.out.println(burger2.tulostaSisältö());
    }
}
