package com.AssignmentTwo;

import com.sun.javafx.binding.StringFormatter;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Rafi";

        // get bytes() method to convert String into bytes[].

        byte[] nByte = name.getBytes();

        byte[] result = new byte[nByte.length];

        //store result in reverse order into the result byte.

        for (int i = 0; i < nByte.length; i++)
            result [i] = nByte[nByte.length- i - 1];

        System.out.println(new String(result));
    }
}
