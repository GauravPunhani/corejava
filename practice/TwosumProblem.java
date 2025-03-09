package com.example.demo.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Given an array , find indices of numbers that add up  to a given target value
* Brute force - n-square two loops
* Additional data structure Hashmap approach
* */
public class TwosumProblem {
    public static void main(String[] args) {
        int arr [] = {2,19,1,7,60,4};
        int indices [] = getIndices(arr,64);
        Arrays.stream(indices).forEach(x->System.out.println(x));
    }


    private static int[] getIndices(int[] arr, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(tempMap.containsKey(complement)){
                return new int[]{tempMap.get(complement),i};
            }
            tempMap.put(arr[i],i);
        }
        //return empty array if no solution found
        return new int[]{};
    }
}
