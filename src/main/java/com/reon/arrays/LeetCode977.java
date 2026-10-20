package com.reon.arrays;

import java.util.Arrays;

public class LeetCode977 {
//    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int abs = Math.abs(nums[i]);
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0, end = nums.length - 1;

        for (int i = nums.length - 1; i >=0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}
