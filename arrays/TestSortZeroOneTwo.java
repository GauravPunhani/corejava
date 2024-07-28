package com.tpex.common.component;

import java.util.ArrayList;
import java.util.List;

public class TestSortZeroOneTwo {
    public static void main(String[] args) {
        int [] arr = {0,2,2,1,1,1,0,0};
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> oneList = new ArrayList<>();
        List<Integer> twoList = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0)
                zeroList.add(arr[i]);
            if(arr[i]==1)
                oneList.add(arr[i]);
            if(arr[i]==2)
                twoList.add(arr[i]);
        }
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zeroList);
        finalList.addAll(oneList);
        finalList.addAll(twoList);
        System.out.println(finalList);
    }
}
