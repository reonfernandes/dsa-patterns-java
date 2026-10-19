package com.reon.arrays;

public class LeetCode27 {

    public int removeElement(int[] nums, int val) {
        int start = 0, count = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[start++] = nums[fast];
                count++;
            }
        }
        return count;
    }
}
