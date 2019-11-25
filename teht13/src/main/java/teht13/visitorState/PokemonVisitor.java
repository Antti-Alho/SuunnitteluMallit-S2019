/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht13.visitorState;

/**
 *
 * @author antti
 */
public class PokemonVisitor implements Visitor{

    @Override
    public PokemonState visitPokemon(Pokemon p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PokemonState visitPokemon(Machamp p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PokemonState visitPokemon(Machoke p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PokemonState visitPokemon(Machop p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PokemonState visitPokemon(PokemonState current) {
        int exp = current.getExp();
        if (exp < 3){
            return current;
        } else if ( exp < 6 ){
            return new Machoke(exp);
        }  else if ( exp < 9 ) {
            return new Machamp(exp);
        }  else return new Machop(0);
    }
    
}
