package com.example.demo.java8.test;

import java.util.function.Function;

public class FunctionTypeInterface {
    public static void main(String[] args) {
        Function<Integer,Double> half = a->a/2.0;
        half = half.andThen(a->a*3);
        System.out.println(half.apply(10)); // output 15

        half=half.compose(a->3*a);
        System.out.println(half.apply(10)); // output 45 first compose , main , andThen
    }
}
