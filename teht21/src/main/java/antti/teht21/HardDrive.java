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
class HardDrive {
    public byte[] read(long lba, int size) { 
        System.out.println(lba);
        System.out.println(size);
        System.out.println("HD done");
        return new byte[499];
    }
}
