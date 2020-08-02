package com.coding.test.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ArrayDuplicates {

    static boolean containsDuplicateHashSet(int[] nums) {
        Set<Integer> numsMap = new HashSet<>();
        for(int num:nums) {
            if(numsMap.contains(num)) return true;
            numsMap.add(num);
        }
        return false;
    }

    static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicateHashSet(nums));
        System.out.println(containsDuplicateSorting(nums));
    }
}
