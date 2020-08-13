package com.coding.test.string;

public class ValidPalindrome {
    static boolean isValid(String s) {
        for(int i=0, j=s.length()-1; i<s.length(); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("ama"));
    }
}
