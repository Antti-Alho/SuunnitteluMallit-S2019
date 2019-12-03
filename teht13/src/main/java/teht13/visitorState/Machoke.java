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
public class Machoke extends Pokemon implements PokemonState{

    public Machoke(int exp) {
        super(exp);
    }

    @Override
    public void lyö() {
        exp++;
        System.out.println("Löit...");
    }

    @Override
    public void potki() {
        exp++;
        System.out.println("Potkit...");
    }

    @Override
    public void pure() {
        exp++;
        System.out.println("Puret...");
    }
    
}
