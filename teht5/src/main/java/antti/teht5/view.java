/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht5;

/**
 *
 * @author antti
 */
public class view {
    private SingletonState state;

    public view() {
        this.state = SingletonState.getInstance();
    }
    
    public void print(String s) {
        if (state.getState()) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
