package com.example.demo;

public class SingletonTest {
    private static SingletonTest singleton;
    private SingletonTest(){

    }
    public static SingletonTest getInstance(){
        if(singleton == null ){
            singleton = new SingletonTest();
        }
        return singleton;
    }
}
