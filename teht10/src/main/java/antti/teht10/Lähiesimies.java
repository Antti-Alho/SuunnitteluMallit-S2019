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
public class Lähiesimies implements Esimies {

    static int suurinMäärä = 2;
    private Esimies yp;
    
    public Lähiesimies(YksikönPäälikkö yp){
        this.yp = yp;
    }

    @Override
    public void palkankorotus(int suuruus) {
        if (suuruus > suurinMäärä) {
            System.out.println("Emmä tällästä uskalla :O t.LähiEsimies");
            yp.palkankorotus(suuruus);
        } else {
            System.out.println("Saat "+ suuruus +"% korotuksen t. lähiEsimeis");
        }
    }
    
}
