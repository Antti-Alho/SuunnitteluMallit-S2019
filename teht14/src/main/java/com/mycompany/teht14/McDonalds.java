/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antti
 */
public class McDonalds implements BurgerBuilder{
    List<BrgrPart> burgerParts = new ArrayList<>();

    public McDonalds(){
        Pihvi p = new Pihvi("perus pihvi");
        Sampyla s = new Sampyla("perus sämpylä");
        burgerParts.add(p);
        burgerParts.add(s);
    }

    public Burger getBurger() {
        return new McBurger(burgerParts);
    }
}
