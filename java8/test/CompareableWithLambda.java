package com.example.demo.java8.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareableWithLambda {
    static class Employee{
        int age;
        String name;
        @Override
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 34;
        e1.name = "mahesh";

        Employee e2 = new Employee();
        e2.age = 34;
        e2.name = "aman";
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        System.out.println("array before sorting " + employeeList);
        employeeList.sort((e11,e22)-> e11.name.compareTo(e22.name));
        System.out.println("array after sorting " + employeeList);
    }
}
