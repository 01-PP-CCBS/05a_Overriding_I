package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        child Child = new child();
        output(Child.sayHello());
        output(Child.sayHello("Jan"));


    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

