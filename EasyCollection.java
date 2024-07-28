package com.example.demo;

import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class EasyCollection {

   /* public static <T> List<T> getFilteredResults(List<T> inputList, String propertyName, Class className) throws NoSuchFieldException {
        Field field = className.getField(propertyName);
        Collections.sort();
        return inputList.stream().filter(i-> {
            try {
                System.out.println(i.getClass().getField(propertyName).getName());
                return i.name.equals("ss");
                //return i.getClass().getField(propertyName).getName().equals("ss");
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }*/
    public static void main(String[] args) throws NoSuchFieldException {
      System.out.println("hello");
    }

}
