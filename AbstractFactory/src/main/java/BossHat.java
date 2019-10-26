/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class BossHat extends Hat {

    public BossHat(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Boss Hat: "+super.name;
    }
    
}
