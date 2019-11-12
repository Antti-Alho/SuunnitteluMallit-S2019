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
        psm.addPokemonState("machop", new Machop());
        psm.addPokemonState("machoke", new Machoke());
        psm.addPokemonState("machamp", new Machamp());
        
        
        psm.switchState("machop");
        
        psm.lyö();
        psm.potki();
        psm.pure();
        
        psm.switchState("machoke");
        
        psm.lyö();
        psm.potki();
        psm.pure();
        
        psm.switchState("machamp");
                
        psm.lyö();
        psm.potki();
        psm.pure();
    }
}
