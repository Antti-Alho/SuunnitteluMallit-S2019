/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class Machoke implements PokemonState{

    @Override
    public void lyö() {
        System.out.println("Löit...");
    }

    @Override
    public void potki() {
        System.out.println("Potkit...");
    }

    @Override
    public void pure() {
        System.out.println("Puret...");
    }
    
}
