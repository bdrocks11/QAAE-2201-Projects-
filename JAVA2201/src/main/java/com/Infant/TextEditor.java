package com.Infant;

public class TextEditor {



    public static void main(String[] args) {
        TextEditor obj = new TextEditor();

        obj.openTextEditor();
        obj.writeInToTextFile("my name is Rafi");
        obj.writeInToTextFile("my name is also Abu");
        obj.writeInToTextFile("i can write as many line i want " +
                "in the writeIntoTextFile method.");

    }
public void openTextEditor(){
    System.out.println("opening text editor");
}
public void writeInToTextFile(String input){
    System.out.println("my input states: " + input);
}
public void closeTextEditor(){
    System.out.println("editor closed");
}


}
