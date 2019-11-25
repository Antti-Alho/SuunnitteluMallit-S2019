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
public interface Visitor {
    public PokemonState visitPokemon(Pokemon p);
    public PokemonState visitPokemon(Machamp p);
    public PokemonState visitPokemon(Machoke p);
    public PokemonState visitPokemon(Machop p);
}
