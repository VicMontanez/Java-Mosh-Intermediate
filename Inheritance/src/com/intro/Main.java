package com.intro;

public class Main {

    public static void main(String[] args) {
        var box1 = new Textbox();
        var box2 = box1;
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
    }
}
