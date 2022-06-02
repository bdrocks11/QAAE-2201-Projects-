package com.AssignmentTwo;

public class IntToDouble {
    public static void main(String[] args) {
        int i = 100;
        double d = new Double(i); // one way//

        double d2 = Double.valueOf(i); //another way

        double d3 = i; // third way and simplest way #sana


        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("we converted int to double by instantiating double class or by calling double.valueOf() method. ");
        System.out.println("casting can be done by calling the data type = the variable of the original data type.");
    }


}
