/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht10;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        Esimies e = new Lähiesimies(new YksikönPäälikkö(new ToimitusJohtaja()));
        e.palkankorotus(1);
        e.palkankorotus(2);
        e.palkankorotus(3);
        e.palkankorotus(4);
        e.palkankorotus(5);
        e.palkankorotus(6);
    }
}
