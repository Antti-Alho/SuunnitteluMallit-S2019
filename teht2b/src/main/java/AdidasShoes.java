/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class AdidasShoes extends Shoes {

    public AdidasShoes(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Adidas Shoes: "+super.name;
    }
    
}
