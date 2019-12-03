/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teht20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1: a iteroidaan samaan aikaan eri iteraattorilla");
        System.out.println("2: b käytetään samaa iteraattoria");
        System.out.println("3: c kokoelmaan lisätään asioita iteroidessa");
        System.out.println("4: d poistetaan iteroitavasta");
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        switch (a){
            case 1:
                Tulostin t1 = new Tulostin(list);
                Tulostin t2 = new Tulostin(list);
                t1.start();
                t2.start();
            break;
            case 2:
                TuhoRaattori iterator = new TuhoRaattori(list);
                t1 = new Tulostin(list, iterator);
                t2 = new Tulostin(list, iterator);
                t1.start();
                t2.start();
            break;
            case 3:
                Tuhostin tuho = new Tuhostin(list);
                t1 = new Tulostin(list);
                t2 = new Tulostin(list);

                t1.start();
                t2.start();
                tuho.start();
            break;
            case 4:
                t1 = new Tulostin(list);
                t2 = new Tulostin(list);
                MegaTuhostin tuho2 = new MegaTuhostin(list);

                t1.start();
                t2.start();
                tuho2.start();
            break;
        }
        
    }

}
