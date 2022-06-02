package com.AssignmentFour;

import java.util.Scanner;

public class ValidPassword {

    public static final int Password_Length = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. A password must have at least ten characters. \n " +
                "2. A password consists of only letters and digits. \n " +
                "3. A password must contain at least two digits. \n" +
                "Input a password (you are agreeing to the above terms and conditions.): ");

        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);


        }

    }

    public static boolean is_Valid_Password(String password) {
        if (password.length() < Password_Length) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++){

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_letter(ch)) charCount++;

            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean is_letter (char ch){
        ch = Character.toUpperCase(ch);
    return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric (char ch) {
        return (ch >= '0' && ch <= '9');
    }
}