package com.cc.java;

public class App {
    public static void main(String[] args) {
     
    Child child =  new Child();

    ausgabe(child.sayHello());
    ausgabe(child.sayHello("Parent"));

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
