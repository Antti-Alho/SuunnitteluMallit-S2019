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
class Tulostin {

   
    boolean tulosta(Tulostettava tulostettava) {
        try {
            System.out.println(tulostettava);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
