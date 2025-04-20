package com.example.demo.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,7,9};
        int index = getIndexForelement(arr,2);
        System.out.println(index);
    }

    private static int getIndexForelement(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
           if(target == arr[mid])  {
               return mid;
           }
           if(target > arr[mid]){
               start = mid+1;
           }
           if(target < arr[mid]){
               end = mid-1;
           }
        }
        return -1;
    }
}
