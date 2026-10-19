package com.reon.arrays;

public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        int start = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[start];
                nums[start] = nums[fast];
                nums[fast] = temp;
                start++;
            }
        }
    }
}
