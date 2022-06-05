package com.AssignmentTwo;

public class StringStarting {
    public static void main(String[] args) {

        String str = "My name is Rafi";
        String str2 = "Not relevant ";

        // string to check the above two String to see
        // if they start with this value "My";

        String startStr = "My";

        // do either of the first two Strings start with startStr?

        boolean startS1 = str.startsWith(startStr);
        boolean startS2 = str2.startsWith(startStr);

        //display the result of the starts with calls.

        System.out.println( str + " starts with " + startStr + " ? " + startS1);

        System.out.println(str2 + " starts with " + startStr + " ? " + startS2);
    }
}
