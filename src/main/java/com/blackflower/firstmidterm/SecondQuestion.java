package com.blackflower.firstmidterm;

/**
 *
 * @author emirs
 */
public class SecondQuestion {

    public static void main(String[] args) {

        int initNum = 4;
        for (int i = 1; i <= 16; i *= 2) {
            System.out.print(i + " ");
            for (int j = 1; j <= i - j; j++) {
                System.out.print(initNum + " ");
                initNum += 2;
            }
            System.out.println();
        }
    }

    /* THE OUTPUT IN BELOW
        1 
        2 4 
        4 6 8 
        8 10 12 14 16 
        16 18 20 22 24 26 28 30 32 
     */
}
