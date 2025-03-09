package com.example.demo.arrays;

public class TestLargest3Numbers {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        int max=arr[0];
        int first, second, third;
        first=second=third=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            } else if(arr[i]>second){
                third =second;
                second =arr[i];
            }else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }
}
