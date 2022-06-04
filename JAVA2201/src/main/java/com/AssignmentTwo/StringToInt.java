package com.AssignmentTwo;

public class StringToInt {
    public static void main(String[] args) {


        String s = "200";

        int i = Integer.parseInt(String.valueOf(s));

        System.out.println(i);

        Integer ii = Integer.valueOf(i);
        System.out.println(ii);

        String ss = "hello";

        int iii = Integer.parseInt(ss);
        System.out.println(iii); // this will throw exception because there are no numbers to convert.

    }
}
