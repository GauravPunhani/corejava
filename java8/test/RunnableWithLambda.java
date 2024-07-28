package com.example.demo.java8.test;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Started runnable...");
            for(int i =0;i<100;i++){
                System.out.println(i);
            }
        };
        new Thread(r).start();
    }
}
