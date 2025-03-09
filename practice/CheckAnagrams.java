package com.example.demo.practice;

/*
* Given two strings , check if they anagrams of each other or not
* Example - rat and tar are anagrams because they have same characters and frequency of characters in both strings are same
* Brute force approach - for each char in first string , iterate over another string to see if its present or not
* Optimal solution -
*       if size of both strings not equal return false
*       Initialize an int array of 26 chars.
*       Iterate over arrays.
*       For each char in first string do newArray[index calcutated from char]+1
* *     For each char in second string do newArray[index calcutated from char]-1
*       In the end check new Array contains only zeros
* */
public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "art";
        int [] arr = new int[26];
        boolean result=true;
        if(s1.length() != s2.length())
            result = false;
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for(int k:arr){
            if(k!=0){
                result = false;
            }
        }
        System.out.println(result);
    }
}
