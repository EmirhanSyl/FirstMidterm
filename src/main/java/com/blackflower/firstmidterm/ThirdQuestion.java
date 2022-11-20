package com.blackflower.firstmidterm;

/**
 *
 * @author emirs
 */
public class ThirdQuestion {

    public static void main(String[] args) {
        int y = 5;
        int x = 1;
        int z = 0;

        while (z < 12) {
            if (x >= (y >> 1)) {
                System.out.println("x: " + x + " y: " + y + " z: " + z);
            }
            z = (3 * x++) + y--;
        }
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }
    
    
    /* THE OUTPUT IN BELOW
        x: 2 y: 4 z: 8
        x: 3 y: 3 z: 10
        x: 4 y: 2 z: 12
    */
}
