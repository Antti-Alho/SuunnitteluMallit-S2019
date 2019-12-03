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
public class Main {
    public static void main(String[] args) {
        
        PokemonStateMachine psm = new PokemonStateMachine();
        psm.lyö();
        System.out.println(psm.getExp());
        psm.potki();
        System.out.println(psm.getExp());
        psm.pure();
        System.out.println(psm.getExp());
        
        psm.lyö();
        System.out.println(psm.getExp());
        psm.potki();
        System.out.println(psm.getExp());
        psm.pure();
        System.out.println(psm.getExp());
                
        psm.lyö();
        System.out.println(psm.getExp());
        psm.potki();
        System.out.println(psm.getExp());
        psm.pure();
        System.out.println(psm.getExp());
    }
}
