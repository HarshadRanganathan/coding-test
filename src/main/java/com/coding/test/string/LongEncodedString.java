package com.coding.test.string;

import java.util.LinkedList;
import java.util.List;

/**
 * Encoding rules:
 * a -> 1
 * i -> 9
 * j -> 10#
 * z -> 26#
 * consecutive characters denoted as (i) where i is the count
 */
public class LongEncodedString {
    public static List<Integer> freqeuency(String s) {
        int alphabetCount = 26;
        int[] freqCount = new int[alphabetCount];
        int len = s.length();
        int i = 0;
        while(i<len) {
            int charVal = 0;
            // a-i one digit encoding
            if(s.charAt(i + 2) != '#') {
                charVal = (s.charAt(i) - '0');
                freqCount[charVal-1]++;
                i++;
            }
            // j-z two digit encoding
            else if(s.charAt(i + 2) == '#') {
                charVal = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                freqCount[charVal-1]++;
                i += 3;
            }
            // check array bounds due to previous increments
            if(i < len) {
                if(s.charAt(i) == '(') {
                    i++;
                    int consecutiveFreq = 0;
                    while(s.charAt(i) != ')') {
                        consecutiveFreq = consecutiveFreq * 10 + (s.charAt(i) - '0');
                        i++;
                    }
                    freqCount[charVal-1] += consecutiveFreq - 1; // since consecutive count is inclusive
                    i++;
                }
            }
        }

        List<Integer> result = new LinkedList<>();
        for(int j=0; j<alphabetCount; j++) {
            result.add(freqCount[j]);
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(freqeuency("1(2)23(3)"));
    }
}
