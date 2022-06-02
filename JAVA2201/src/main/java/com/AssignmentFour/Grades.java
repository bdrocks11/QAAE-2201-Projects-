package com.AssignmentFour;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter grade value: ");

        int value = sc.nextInt();


        if (value >= 90 && value <= 100) {
            System.out.println("AA");
        }
        if (value >= 81 && value <= 90) {
            System.out.println("AB");
        }
        if (value >= 71 && value <= 80) {
            System.out.println("BB");
        }
        if (value >= 61 && value <= 70) {
            System.out.println("CD");
        }
        if (value >=41 && value <= 50){
            System.out.println("F");
        }
        if (value <=40){
            System.out.println("Fail");
        }


    }
}







