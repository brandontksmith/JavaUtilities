package com.btks.utilities;

/**
 * This class adds methods to simplify putting a thread to sleep.
 * 
 * @author BTKS
 */
public class Sleep
{    
    /**
     * The constant used to convert minutes to milliseconds
     */
    
    private static int MINUTE_TO_MILLISECONDS = 60000;
    /**
     * The constant used to convert seconds to milliseconds
     */
    private static int SECOND_TO_MILLISECONDS = 1000;
    
    /**
     * Sleep the thread for the specified minutes.
     * 
     * @param minutes number of minutes to sleep
     */
    public static void minutes(int minutes) {
        int milliseconds = minutes * MINUTE_TO_MILLISECONDS;
        
        sleep(milliseconds);
    }
    
    /**
     * Sleep the thread for just one minute.
     */
    public static void oneMinute() {
        minutes(1);
    }
    
    /**
     * Sleep the thread for just one second.
     */
    public static void oneSecond() {
        seconds(1);
    }
    
    /**
     * Sleep the thread for the specified seconds.
     *
     * @param seconds number of seconds to sleep
     */
    public static void seconds(int seconds) {
        int milliseconds = seconds * SECOND_TO_MILLISECONDS;
        
        sleep(milliseconds);
    }
    
    /**
     * Puts the current thread to sleep for the specified milliseconds.
     * 
     * @param milliseconds number of milliseconds to sleep
     */
    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}