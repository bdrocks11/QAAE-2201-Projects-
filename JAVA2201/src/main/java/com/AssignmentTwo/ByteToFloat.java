package com.AssignmentTwo;

public class ByteToFloat {

    public static void main(String[] args) {
        byte value1 = 10;
        float value2 = value1;

        System.out.println("byte value: " + value1);
        System.out.println("float value: " + value2);

        float value3 = Float.valueOf(value1);

        System.out.println("second way to find float from byte: " + value3);

    }
}
