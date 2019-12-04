/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht21;

/**
 *
 * @author antti
 */
class Memory {
    public void load(long position, byte[] data) {
        System.out.println(position);
        System.out.println(data);
        System.out.println("Memory done");
    }
}
