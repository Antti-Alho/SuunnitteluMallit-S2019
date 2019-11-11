/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
interface AbstractFactory {
    public Pants createPants();
    public Shirt createShirt();
    public Shoes createShoes();
    public Hat createHat();
}
