/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht18;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Kuinka pitkään kellot tikittää?");
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());
        
        System.out.println("Kello tikittää");
        Kello kello = new Kello();
        for (int i = 0; i < a; i++) {
            kello.tick();
            kello.print();
        }
        System.out.println("-----------");
        System.out.println("kello.clone ja molemmat tikittää");
        System.out.println("-----------");
        
        Kello kello2 = new Kello();
        try {
            kello2 = (Kello) kello.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < a; i++) {
            kello2.tick();
            kello2.print();
        }
        
        System.out.println("-----------");
        
        for (int i = 0; i < a; i++) {
            kello.tick();
            kello.print();
        }
    }
}
