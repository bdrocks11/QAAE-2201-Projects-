package com.Infant2;

public class Computer {
    public static void main(String[] args) {
        turnOnComputer();
        turnOffComputer();
        cleanCache();
        reduceBrightness(40);
        playMusic(10);

        ChromeBrowser.openChromeBrowser();
        ChromeBrowser.writeUrl();
        ChromeBrowser.closeChromeBrowser();
        ChromeBrowser.openNewTabInBrowser();

        TextEditor myText = new TextEditor();
        myText.writeInToTextFile("Hello, i am Rafi");
        myText.closeTextEditor();

        MicrosoftOutLook mS = new MicrosoftOutLook(); // created an object

        MicrosoftOutLook.closeOutlook();// calling method by class name

        Calculator.openCalculator();
        Calculator.addTwoDigits();
        Calculator.deductTwoNumber();
        System.out.println("deduction = " + Calculator.deductTwoNumber());
        Calculator.addThreeNumbers(3,5,6);// will not print anything.
        System.out.println("3 added numbers = " + Calculator.addThreeNumbers(4,4,4));
  //printed because of println method.
    }


    public static void turnOnComputer(){
        System.out.println("computer on");
    }
    public static void turnOffComputer(){
        System.out.println("computer off");
    }

    public static void cleanCache(){
        System.out.println("cleaning");
    }
    public static void reduceBrightness(int p){
        System.out.println("reducing brightness by " + p);
    }
    public static void playMusic(int v){
        System.out.println("adjusting volume by " + v);

    }
}
