package com.Infant;

public class MicrosoftOutlook {

    public void openMicrosoftOutlook(){
        System.out.println("outlook opening");
    }
    public static void closeOutLook(){
        System.out.println("closing out look"); //static meaning can be called without an object.

    }

    public static void main(String[] args) {
        MicrosoftOutlook ms = new MicrosoftOutlook();

        ms.openMicrosoftOutlook();
        closeOutLook();
    }

}
