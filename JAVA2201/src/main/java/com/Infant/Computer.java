package com.Infant;

public class Computer {
    public static void turnOnComputer(){ // static, can be called without object because its static.
        System.out.println("turning computer on");
    }
    public void turnOfComputer(){ //need to be called in main by creating an object.
        System.out.println("turning computer off");
    }

    public void cleanCache(){
        System.out.println("cleaning cache files.");
    }


    public void reduceBrightness (int percentage){
        System.out.println("reduce percentage by " + percentage);

    }
    public void playMusic(){
        System.out.println("music playing");
    }

    public void adjustTheVolume(int volume){
        System.out.println("volume is at " + volume);
    }


    public static void main(String[] args) {
        Computer comp = new Computer();

        turnOnComputer();
        comp.turnOfComputer();
        comp.cleanCache();
        comp.reduceBrightness(50);
        comp.playMusic();
        comp.adjustTheVolume(21);
    }
}
