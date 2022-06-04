package com.AssignmentTwo;

public class DoubleTOInt {
    public static void main(String[] args) {

        double d = 10.5;

        int a = (int) d; //simple casting

        System.out.println(a);

        Double d1 = new Double(10.5); //created an object to cast from Double to int.
//manual casting
        int i = d1.intValue();
        System.out.println(i);
    }
}