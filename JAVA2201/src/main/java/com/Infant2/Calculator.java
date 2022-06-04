package com.Infant2;

public class Calculator {

    public static void openCalculator(){
        System.out.println("calculator app open");
    }

    public static void addTwoDigits(){
        System.out.println("what is 2+2 = ?");
    }

    public static int deductTwoNumber(){
        int a = 5 ;
        int b = 3 ;
        int result = (a-b);

        return result;

    }
    public static int addThreeNumbers(int a, int b, int c){
        int result = (a+b+c);
        return result;
    }
}
