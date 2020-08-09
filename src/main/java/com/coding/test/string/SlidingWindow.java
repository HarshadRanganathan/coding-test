package com.coding.test.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class SlidingWindow {

    static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0, j=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwetwkejuy";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
