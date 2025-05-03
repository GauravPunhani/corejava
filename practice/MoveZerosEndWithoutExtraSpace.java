package com.example.demo.practice;
/*
* Maintain 2 pointers , right pointer tracks non zero element.
* If right element is non zero then swap left with right. and move both pointers forward
* */
public class MoveZerosEndWithoutExtraSpace {
    public static void main(String[] args) {
        int [] arr = {1,0,5,0,9,8,0,7};
        int left = 0, right = 0;
        while(right<arr.length){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right++;
                left++;
            }else{
                right++;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
