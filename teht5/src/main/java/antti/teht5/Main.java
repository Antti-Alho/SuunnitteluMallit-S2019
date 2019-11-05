/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht5;

import java.util.Scanner;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        view a = new view();
        view b = new view();
        String s;
        
        while (true) {
            System.out.println("Mitä tulostetaan:");
            s = sc.nextLine();
            System.out.println("------------------");
            a.print(s);
            b.print(s);
        }
    }
}
