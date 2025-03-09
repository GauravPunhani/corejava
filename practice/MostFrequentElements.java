package com.example.demo.practice;

import java.util.*;
import java.util.stream.Collectors;

/*
* First approach - Hashmap containing occurences  + sort the hashmap (nlogn) - since n is large its value is big
* Second approach - Hashmap containing occurences  + Priority queue (nlogk)
* */
public class MostFrequentElements {
    public static void main(String[] args) {
        int [] arr = {1,2,2,5,5,5};
        int k = 2;
        Map<Integer,Integer> occurences = new HashMap<>();
        for(int i: arr){
            if(occurences.containsKey(i)){
                occurences.put(i,Integer.valueOf(occurences.get(i).intValue() + 1));
            }else{
                occurences.put(i,1);
            }
        }
        List mostFrequent = occurences.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(entry->entry.getKey()).collect(Collectors.toList());
        for(int i =0;i<k;i++){
            System.out.println(mostFrequent.get(i));
        }
    }
}
