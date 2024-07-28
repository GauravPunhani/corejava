package com.tpex.common.component;
/*
Shift even digits to left - Two pointer approach
 */
public class TestEvenShift {
    public static void main(String[] args) {
        int [] arr = {1,4,2,9,7,3,6};
        for(int i=0,j=0;j<arr.length;j++){
            if(arr[j]%2 ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            continue;
        }
        for(int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
