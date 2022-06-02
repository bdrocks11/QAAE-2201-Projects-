package com.Infant;

public class ChromeBrowser {
    public void openChromeBrowser(){
        System.out.println("browser opened");
    }
    public void writeUrl(){
        System.out.println("writing url in chrome browser");
    }
    public void closeBrowser(){
        System.out.println("browser being closed");
    }
    public void openNewTab(){
        System.out.println("opening new tab in Chrome browser");
    }

    public static void main(String[] args) {
        ChromeBrowser ch = new ChromeBrowser();
        ch.openChromeBrowser();
        ch.writeUrl();
        ch.closeBrowser();
        ch.openNewTab();

    }
}
