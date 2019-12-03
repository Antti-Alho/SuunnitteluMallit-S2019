/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht14;

import java.util.List;

/**
 *
 * @author antti
 */
public class McBurger implements Burger {
    
    String nimi = "";

    public McBurger() {
    }

    McBurger(List<BrgrPart> burgerParts) {
        burgerParts.forEach((burgerPart) -> {
            this.nimi += burgerPart.nimi;
        });
    }

    @Override
    public String tulostaSisältö() {
        return nimi;
    }
    
}
