/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht20;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author antti
 */
public class TuhoRaattori implements Iterator<Integer> {

    private ArrayList<Integer> l;
    private int pos;
    private int length;


    public TuhoRaattori(ArrayList l) {
        this.l = l;
        this.pos= 0;
        this.length = l.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return pos <= length;
    }

    @Override
    public Integer next() {
        int r = l.get(pos);
        pos++;
        return  r;
    }
}
