package com.intro;

public class Textbox extends UIControl{
    private String text = "";

    public Textbox() {
        super(true);
        System.out.println("Textbox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {this.text = text}

    public void clear() { text = ""; }

}
