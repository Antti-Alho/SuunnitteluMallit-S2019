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
public class PokemonStateMachine implements PokemonState{
    PokemonState current;
    PokemonVisitor pv = new PokemonVisitor();
    
    public PokemonStateMachine(){
        current = new Machop(0);
    }
    
    private void changeState() {
        this.current = pv.visitPokemon(current);
    }

    @Override
    public void lyö() {
        current.lyö();
        changeState();
    }

    @Override
    public void potki() {
        current.potki();
        changeState();
    }

    @Override
    public void pure() {
        current.pure();
        changeState();
    }

    @Override
    public int getExp() {
        return current.getExp();
    }
    
}
