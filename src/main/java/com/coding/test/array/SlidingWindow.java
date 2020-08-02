package com.coding.test.array;

/**
 * Given an array of integers of size ‘n’.
 * Our aim is to calculate the maximum sum of ‘k’
 * consecutive elements in the array.
 */
public class SlidingWindow {

    static int maxSum(int[] arr, int n, int k) {
        if(n < k) {
            return -1;
        }

        int max_sum = 0;
        for(int i=0; i<k; i++) {
            max_sum += arr[i];
        }

        int window_sum = max_sum;
        for(int i=k ; i<n ; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
