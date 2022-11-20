package com.blackflower.firstmidterm;

/**
 *
 * @author emirs
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.salary = 8000;
        System.out.println(employee.CheckAdvanceAmount(3000, 3000));
    }
}
