package teht13.visitorState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class Machamp extends Pokemon implements PokemonState{

    public Machamp(int exp) {
        super(exp);
    }

    @Override
    public void lyö() {
        exp++;
        System.out.println("Löit...  it's super effective!");
    }

    @Override
    public void potki() {
        exp++;
        System.out.println("Potkit...  it's not very effective!");
    }

    @Override
    public void pure() {
        exp++;
        System.out.println("Puret...  it's not very effective!");
    }
    
}
