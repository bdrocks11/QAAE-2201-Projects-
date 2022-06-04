package com.AssignmentTwo;

public class IntToString {
    public static void main(String[] args) {

        int i = 10;

        String s = String.valueOf(i);

        System.out.println(s);
        System.out.println(i+10); //result is 20 because binary plus operator;
        System.out.println(s+10); // result is 1010 because + is String concatenation operator;

        String s1 = Integer.toString(i);

        System.out.println(s1);
    }





}
