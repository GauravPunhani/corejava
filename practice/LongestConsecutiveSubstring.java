package com.example.demo.practice;

import java.util.HashMap;
import java.util.Map;
/*
* Put inside map when
* */
public class LongestConsecutiveSubstring {
    public static void main(String[] args) {
        String test = "aaaeeegoooooook";
        int maxCount = 1;
        Character maxChar = test.charAt(0);
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i=0;i<test.length();i++){
            if(test.length()==1){
                maxChar=test.charAt(0);
                break;
            }
            if(i==0) continue;
            if(maxChar==test.charAt(i)){
                maxCount++;
            }
            if(maxChar!=test.charAt(i)){
                countMap.put(maxChar,maxCount);
                maxCount=1;
                maxChar=test.charAt(i);
            }
        }
        Map.Entry maxEntry = countMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(maxEntry.getKey());
    }
}
