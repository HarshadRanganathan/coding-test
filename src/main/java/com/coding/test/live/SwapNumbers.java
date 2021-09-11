package com.coding.test.live;

public class SwapNumbers {
    static void swap(int a, int b) {
        a = a - b; // 23
        b = a + b; // 31
        a = b - a; // 8
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        swap(31, 8);
    }
}
