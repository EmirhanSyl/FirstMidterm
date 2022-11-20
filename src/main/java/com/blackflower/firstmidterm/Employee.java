package com.blackflower.firstmidterm;

/**
 *
 * @author emirs
 */
public class Employee {
    int salary;
    int advancePayment1;
    int advancePayment2;
    
    public boolean CheckAdvanceAmount(int pAdvancePayment1, int pAdvancePayment2){
        advancePayment1 = pAdvancePayment1;
        advancePayment2 = pAdvancePayment2;
        
        int total = advancePayment1 + advancePayment2;
        return (total > salary) ? true : false;
    }
}
