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
class YksikönPäälikkö implements Esimies{
    
    static int suurinMäärä = 5;
    private Esimies tj;
    
    public YksikönPäälikkö(ToimitusJohtaja tj){
        this.tj = tj;
    }

    @Override
    public void palkankorotus(int suuruus) {
        if (suuruus > suurinMäärä) {
            System.out.println("Emmä tällästä uskalla :O t.YksikönPäälikkö");
            tj.palkankorotus(suuruus);
        } else {
            System.out.println("Saat "+ suuruus +"% korotuksen t.YksikönPäälikkö");
        }
    }
    
}
