package com.coding.test.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 */
public class TwoSum {

    static int[] twoSumTwoLoop(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    static int[] twoSumOneLoop(int[] nums, int target) {
        final Map<Integer, Integer>  numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result1 = twoSumTwoLoop(nums, target);
        for (int value : result1) {
            System.out.println(value);
        }
        int[] result2 = twoSumOneLoop(nums, target);
        for (int value : result2) {
            System.out.println(value);
        }
    }
}
