package com.example.demo.practice;

public class Palindromerecursion {
    public static void main(String[] args) {
        String test = "abcba";
        boolean isPalindromeString = isPalindromeString(test);
        System.out.println("result is "+ isPalindromeString);
    }

    private static boolean isPalindromeString(String test) {
        boolean result = false;
        if(test.length() == 1)
            return true;
        if(test.charAt(0) == test.charAt(test.length()-1)){
            String newTestString = test.substring(1,test.length()-1);
            if(isPalindromeString(newTestString)){
                result = true;
            }
        }

        return result;
    }
}
