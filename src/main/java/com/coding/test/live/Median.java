package com.coding.test.live;

import java.util.Arrays;

public class Median {
    static float findMedian(int arr[], int n) {
        Arrays.sort(arr); // 1, 2, 3, 4, 5, 6, 7
        int mid = arr.length / 2;
        if(arr.length % 2 != 0) return arr[mid];
        return ( (float) arr[mid - 1] + (float) arr[mid] ) / 2;
    }

    public static void main(String args[])
    {
        int a[] = { 1, 3, 4, 2, 7, 5, 6 };
        int n = a.length;
        System.out.println("Median = " + findMedian(a, n));
    }
}
