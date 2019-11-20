/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht11;

/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas aapo = new Asiakas(arvuuttaja, "aapo");
        Asiakas aaro = new Asiakas(arvuuttaja, "aaro");
        Asiakas alpo = new Asiakas(arvuuttaja, "alpo");
        arvuuttaja.liityPeliin(aapo);
        arvuuttaja.liityPeliin(aaro);
        arvuuttaja.liityPeliin(alpo);
        aaro.start();
        alpo.start();
        aapo.start();
    }
}
