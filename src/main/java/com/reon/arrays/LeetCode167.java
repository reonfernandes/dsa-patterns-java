package com.reon.arrays;

import java.util.Arrays;

public class LeetCode167 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }

            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
