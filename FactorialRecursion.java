package com.example.demo;

public class FactorialRecursion {
    public static void main(String[] args) {
        int testNumber = 5;
        int factorial = getFactorial(testNumber);
        System.out.println("factorial is " +factorial);
    }

    private static int getFactorial(int testNumber) {
        if(testNumber == 1)
            return testNumber;
        return testNumber * getFactorial(testNumber-1);
    }
}
