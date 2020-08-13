package com.coding.test.array;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 */
public class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = String.valueOf(c);

            if(!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<>());
            }

            anagrams.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input));
    }
}
