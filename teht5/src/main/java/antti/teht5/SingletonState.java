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
public class SingletonState {
    
    private int counter = 0;

    private SingletonState(){}
    
    private static class SingletonHelper{
        private static final SingletonState INSTANCE = new SingletonState();
    }
    
    public static SingletonState getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    public boolean getState(){
        this.counter++;
        System.out.println(this.counter);
        if (counter % 3 == 0) { 
            return true;
        } else {
            return false;
        }
        
    }
    
}
