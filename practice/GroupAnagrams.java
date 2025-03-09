package com.example.demo.practice;

import java.sql.Array;
import java.util.*;

/*
* Given an array of strings , group together anagrams
* {"eat","tee","ate","bat","eet"} - Input
* {{"bat"},{"eat","ate"},{"tee","eet"}} - Output
*
* Create a binary representation of each String and store it in map as a key . Value would be list of objects
* All anagrams will create same binary key
* */
public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> resultMap = new HashMap();
        String[] strings = {"eat","tee","ate","bat","eet"};
        int [] count = new int[26];
        if(strings.length==0){
            System.out.println(result);
        }
        for(String s : strings){
            Arrays.fill(count,0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int x : count){
                sb.append(x);
            }
            String key = sb.toString();
            if(!resultMap.containsKey(key)){
                resultMap.put(key,new ArrayList<>());
            }
            resultMap.get(key).add(s);
        }
        result.addAll(resultMap.values());
        System.out.println(result);
    }
}
