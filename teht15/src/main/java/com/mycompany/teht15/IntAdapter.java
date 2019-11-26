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
class IntAdapter extends Tulostettava{

    IntAdapter(EiTulostettava et) {
        super(Integer.toString(et.getA()));
    }
}
