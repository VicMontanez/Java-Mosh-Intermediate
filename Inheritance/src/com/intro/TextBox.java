package com.intro;

public class Textbox extends UIControl{
    private String text = "";

    public Textbox() {
        System.out.println("Textbox");
    }

    public void setText(String text) {this.text = text}

    public void clear() { text = ""; }

}
