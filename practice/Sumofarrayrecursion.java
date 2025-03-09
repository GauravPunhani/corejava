package com.example.demo.practice;

import java.util.Arrays;

public class Sumofarrayrecursion {
    public static void main(String[] args) {
        int [] arr = {4,6,9,1,90};
        int sum = getSumOfArray(arr);
        System.out.println("sum is "+ sum);
    }

    private static int getSumOfArray(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        return arr[0]+getSumOfArray(Arrays.copyOfRange(arr,1,arr.length));
    }
}
