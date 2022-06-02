package com.Infant;

public class Calculator {
    public void openCalculator(){
        System.out.println("calculator opened");
    }

    public void addition(){
        int a =2;
        int b = 3;
        int equals = (a+b);
        System.out.println("sum is " + equals);
    }

    public void deduction(int a, int b){

        int result = (a-b);
        System.out.println( "result after deduction " + result);

    }

    public void addThreeNumbers(int a, int b, int c){

        int result = (a+b+c);
        System.out.println("sum of three number is " + result);
    }
    public void deductThreeNumbers(){
        int a = 5;
        int b = 4;
        int c = 3;
        int result = (a-b-c);
        System.out.println("result after deducting three number " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.addition();
        calc.deduction(5,4);
        calc.addThreeNumbers(3,4,5);

    }
}
