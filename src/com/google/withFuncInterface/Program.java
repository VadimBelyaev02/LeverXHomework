package com.google.withFuncInterface;

public class Program {

    public static void main(String[] args) {
        MyFunctionalInterface myInterface = (a) -> a + 1;

        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public int doSomething(int a) {
                return a + 1;
            }
        };

        System.out.println(myFunctionalInterface.doSomething(1));

        System.out.println(myInterface.doSomething(1));
    }
}
