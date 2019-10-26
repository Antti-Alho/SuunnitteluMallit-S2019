/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class AdidasFactory implements AbstractFactory{

    @Override
    public Pants createPants() {
        return new AdidasPants("Adidas mega raita pants");
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt("Adidas sport shirt");
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes("Adidas runnign shoes ft.mjordan");
    }

    @Override
    public Hat createHat() {
        return new AdidasHat("Sports baseball cap by adidas.");
    }
    
}
