
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class PokemonStateMachine implements PokemonState{
    PokemonState current;
    HashMap<String, PokemonState> allStates = new HashMap<>();
    
    public void addPokemonState(String name, PokemonState pokemon){
        this.allStates.put(name, pokemon);
    }
    
    public void switchState(String name){
        this.current = allStates.get(name);
    }
    
    public void changeState(PokemonState ps) {
        this.current = ps;
    }

    @Override
    public void lyö() {
        current.lyö();
    }

    @Override
    public void potki() {
        current.potki();
    }

    @Override
    public void pure() {
        current.pure();
    }
    
}
