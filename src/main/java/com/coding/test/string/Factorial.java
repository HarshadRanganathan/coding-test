package com.coding.test.string;

public class Factorial {
    static long fact(long n) {
        if(n <= 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
