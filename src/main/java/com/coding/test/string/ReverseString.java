package com.coding.test.string;

public class ReverseString {

    static String reverseString(char[] s) {
        for(int i=0, j=s.length-1; i<j; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("helloworld".toCharArray()));
    }
}
