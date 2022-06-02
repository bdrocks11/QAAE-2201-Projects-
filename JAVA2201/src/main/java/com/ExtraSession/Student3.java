package com.ExtraSession;

public class Student3 {
    String name;
    int roll ;
    String course;
    int grade;
    String phone;

    public void printInfo(String n, int r, String c, int g, String p){

        System.out.println("my name is " + n );
        System.out.println("my roll is " + r );
        System.out.println("my course is " + c );
        System.out.println("my grade is " + g);
        System.out.println("my phone number is " + p );

        

    }

    public static void main(String[] args) {

        Student3 s3 = new Student3();
        Student3 s4 = new Student3();

        s3.printInfo("rafi", 01, "QAAE-2201", 123, "716424RAFI");
        s4.printInfo("abu", 02, "QAAE-2201", 124, "716424ABUS");

}

}


