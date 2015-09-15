package com.btks.utilities;

/**
 * This class adds helper methods that can be used to perform additional checks
 * on Numbers.
 * 
 * @author BTKS
 */
public class Number {
    
    /**
     * Checks if a number is a Whole Number (aka an Integer).
     * 
     * @param num number to check
     * @return true if the number is whole
     */
    public static boolean isWhole(double num) {
        if (num % 1 == 0) {
            return true;
        }
        
        return false;
    }
    
    /**
     * Checks if a number is even.
     * 
     * @param num number to check
     * @return true if the number is even
     */
    public static boolean isEven(double num) {
        if (num % 2 == 0) {
            return true;
        }
        
        return false;
    }
    
    /**
     * Checks if a number is odd.
     * 
     * @param num number to check
     * @return true if the number is odd
     */
    public static boolean isOdd(double num) {
        if (!isEven(num)) {
            return true;
        }
        
        return false;
    }
}