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
class CPU {
    public void freeze() { System.out.println("Freeze"); }
    public void jump(long position) { System.out.println(" position : "+position); }
    public void execute() { System.out.println("execute"); }
}
