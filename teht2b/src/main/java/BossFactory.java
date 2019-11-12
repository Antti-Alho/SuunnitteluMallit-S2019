/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class BossFactory implements AbstractFactory{

    @Override
    public Pants createPants() {
        return new BossPants("Black Boss Boss pants");
    }

    @Override
    public Shirt createShirt() {
        return new BossShirt("Black boss boss shirt");
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes("Black leather boss boss shoes");
    }

    @Override
    public Hat createHat() {
        return new BossHat("Bosses dont wear hat's boss hat");
    }
    
}
