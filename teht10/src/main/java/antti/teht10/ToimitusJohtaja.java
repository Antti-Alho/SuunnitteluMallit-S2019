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
class ToimitusJohtaja implements Esimies{

    @Override
    public void palkankorotus(int suuruus) {
        System.out.println("Saat "+ suuruus +"% korotuksen t. ToimitusJohtaja");
    }
    
}
