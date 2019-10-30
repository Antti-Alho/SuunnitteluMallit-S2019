/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht3;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        KoosteKomponentti kotelo = new KoosteKomponentti(30);
        KoosteKomponentti emolevy = new KoosteKomponentti(200);
        Komponentti cpu = new Komponentti(300);
        Komponentti gpu = new Komponentti(400);
        Komponentti ram = new Komponentti(100);
        Komponentti muisti = new Komponentti(400);
        
        kotelo.addOsa(emolevy);
        kotelo.addOsa(muisti);
        
        emolevy.addOsa(ram);
        emolevy.addOsa(cpu);
        emolevy.addOsa(gpu);
        
        System.out.println(kotelo.getHinta() + "euroa");
    }
}
