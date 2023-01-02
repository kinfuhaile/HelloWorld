package com.kinfu.haile;

public class HelloWorld {
    public static void main(String[] args) {
        CurrentDateTime cdt = new CurrentDateTime();
        System.out.println("Hello world!" + "The Current time is : " + cdt.getCurrentDateTime());
    }
}