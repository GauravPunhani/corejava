package com.example.demo.java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<List<Integer>> doubleConsumer = list->{
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        doubleConsumer.accept(list);
        System.out.println(list);
    }
}
