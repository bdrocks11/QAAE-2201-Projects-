package com.AssignmentTwo;

public class FloatToDouble {
    public static void main(String[] args) {

        float temp = 14.55F;

        double d = (double) temp;
        System.out.println(d);

        float float_obj = 44.55F;

        Float float_obj1 = new Float(float_obj);

        //widening the float object

        double double_obj = float_obj1.doubleValue();

        System.out.println("new value is = " + double_obj);

    }
}
