/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class BossPants extends Pants {

    public BossPants(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Boss Pants: "+super.name;
    }
    
}
