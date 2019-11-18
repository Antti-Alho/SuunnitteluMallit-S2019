/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht9;

import java.util.Arrays;

/**
 *
 * @author antti
 */
public class RadixSort implements SortMachine{

    @Override
    public int[] sort(int[] arr) {
        int m = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
        return arr;
    }
    
    private void countSort(int[] arr, int exp) {
        int output[] = new int[arr.length];
        int count[] = new int[10];
        
        for (int i = 0; i < arr.length; i++) count[ (arr[i]/exp)%10 ]++;
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        }
        System.arraycopy(output, 0, arr, 0, arr.length); 
    }
}
