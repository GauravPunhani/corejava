package com.example.demo.practice;

import java.util.Stack;

/**
 * Find maximum number of 1's between two zeros .
 * In the array {0,1,1,0,0,1,0,1,1,1,0,1,1} , 3 is the answer
 * If array item is 0 , continue.
 * If array item is 1 , push it to a stack
 * However if index is greater than 0 and stack has elements , it means it is the end
 *  >> currentCountOfOne = stack's size  and then clear the stack
 *  >> if(currentCountOfOne>maxOneCount) then maxOneCount=currentCountOfOne;
 */
public class CountMaxOnesBetweenTwoZeros {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,1,0,1,1,1,0,1,1,1,1,0};
        int maxNumberOfOnes = getmaxNumber(arr);
        System.out.println(maxNumberOfOnes);
    }

    private static int getmaxNumber(int[] arr) {
        int maxOneCount = 0;
        int startIndex = 0;
        int currentCountOfOne = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                startIndex = i;
                if(i>0 && stack.size() > 0){
                    currentCountOfOne=stack.size();
                    stack.clear();
                    if(currentCountOfOne>maxOneCount){
                        maxOneCount=currentCountOfOne;
                    }
                }
                continue;
            }
            if(arr[i] == 1){
                stack.push(arr[i]);
            }
        }
        return maxOneCount;
    }
}
