/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht9;

/**
 *
 * @author antti
 */
public class BubbleSort implements SortMachine {

    public BubbleSort() {
    }

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) { 
                if (arr[j] > arr[j+1]) {  
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
        return arr;
    }
    
}
