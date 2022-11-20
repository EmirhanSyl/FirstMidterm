package com.blackflower.firstmidterm;

/**
 *
 * @author emirs
 */
public class FirstQuestion {
    public static void main(String[] args) {
        int hour1 = 11;
        int hour2 = 10;
        int min1 = 12;
        int min2 = 06;
        
        int totalMin;
        int totalHour;
        
        totalHour = hour2 - hour1;
        if (totalHour < 0) {
            totalHour = 24 + totalHour;
        }
        
        totalMin = min2 - min1;
        if (totalMin < 0) {
            totalMin = 60 + totalMin;
            totalHour--;
        }
        
        System.out.println(totalHour + " hours, " + totalMin + " minutes");
    }
}
