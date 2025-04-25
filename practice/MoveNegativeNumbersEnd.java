package com.example.demo.practice;

public class MoveNegativeNumbersEnd {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int [] temp = new int[arr.length];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                temp[idx++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[idx++]=arr[i];
            }
        }
        System.arraycopy(temp,0,arr,0,arr.length);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
