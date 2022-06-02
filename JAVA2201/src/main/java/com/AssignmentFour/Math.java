package com.AssignmentFour;

public class Math {
    public static void main(String[] args) {
sum();
multiplication();
subtraction();
division();

    }


        public static void sum () {
int a = 4;
int b = 5;
            int result = (a + b);
            System.out.println(result);



        }
        public static void multiplication () {
int a = 3;
int b = 4;
int result = (a*b);
System.out.println(result);

        }
        public static void subtraction (){
        int a = 4;
        int b = 3;
        int result = (a-b);
            System.out.println(result);
        }
        public static void division (){
        double a = 6;
        double b = 4;
        double result = (a/b);
            System.out.println(result);
            /* we used datatype "double" for fractional answer, if we used
            int then it would not provide a fraction.
             */
        }
    }

