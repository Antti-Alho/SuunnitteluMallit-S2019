/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class Machop implements PokemonState{

    @Override
    public void lyö() {
        System.out.println("Löit...  it's not very effective");
    }

    @Override
    public void potki() {
        System.out.println("Potkit...  it's not very effective");
    }

    @Override
    public void pure() {
        System.out.println("Puret...  it's not very effective");
    }
    
}
