package com.example.demo.arrays;

/*
* Use sliding window algorithm
* */
public class LargestSubarraySum {
    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2};
        int sizeOfSubArray = 3;
        System.out.println(getLargestSumOfSubarray(arr,sizeOfSubArray));
    }

    private static int getLargestSumOfSubarray(int[] arr, int k) {
        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];
        int window_sum = max_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;


    }
}
