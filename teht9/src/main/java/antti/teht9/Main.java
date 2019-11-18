/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht9;

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author antti
 */
public class Main {
    public static void main(String[] args) {
        SortMachine sm;
        final int INPUT_LEN = 1000000;
        final int MAX_VAL = 20000000;
        
        
        System.out.println("Bubble sort:");
        int[] arrayToSort = newArray(INPUT_LEN, MAX_VAL);
        sm = new BubbleSort();
        
        Long time = System.currentTimeMillis();
        //sm.sort(arrayToSort);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
        
        System.out.println("Comb sort:");
        arrayToSort = newArray(INPUT_LEN, MAX_VAL);
        sm = new CombSort();
        
        time = System.currentTimeMillis();
        sm.sort(arrayToSort);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
        
        
        System.out.println("Counting sort:");
        arrayToSort = newArray(INPUT_LEN, MAX_VAL);
        sm = new CountingSort();
        
        time = System.currentTimeMillis();
        sm.sort(arrayToSort);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
        
                        
        System.out.println("Radix sort:");
        arrayToSort = newArray(INPUT_LEN, MAX_VAL);
        sm = new RadixSort();
        
        time = System.currentTimeMillis();
        sm.sort(arrayToSort);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
    }
    
    public static int[] newArray(int length, int maxVal){
        Random r = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(maxVal);
        }
        return array;
    }
}
