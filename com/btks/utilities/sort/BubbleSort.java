package com.btks.utilities.sort;

/**
 * This class implements the sorting algorithm Bubble Sort.
 * 
 * @author BTKS
 */
public class BubbleSort {
    
    /**
     * Sorts an array of Integers in ascending order (that is, from smallest to
     * largest), and returns the sorted array.
     * 
     * @param arr array of numbers to be sorted
     * @return sorted numbers from smallest to largest
     */
    public static int[] sortAscending(int[] arr) {
        boolean swapped = true;
        int tmp, j = 0;
        
        while (swapped) {
            swapped = false;
            j++;
            
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i]= arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        
        return arr;
    }
    
    /**
     * Sorts an array of Integers in descending order (that is, from largest to
     * smallest), and returns the sorted array.
     * 
     * @param arr array of numbers to be sorted
     * @return sorted numbers from smallest to largest
     */
    public static int[] sortDescending(int[] arr) {
        boolean swapped = true;
        int tmp, j = 0;
        
        while (swapped) {
            swapped = false;
            j++;
            
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i]= arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        
        return arr;
    }
}