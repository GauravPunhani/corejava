package com.tpex.auth.controller;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElements {
    public static void main(String[] args) {
        int [] arr = {2,5,10,10,11,15,19,21,27,21};
        List<Integer> uniqueElements = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j< arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[j]==arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueElements.add(arr[i]);
            }
        }
        System.out.println(uniqueElements);
    }
}
