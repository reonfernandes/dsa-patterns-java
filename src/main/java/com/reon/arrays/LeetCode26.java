package com.reon.arrays;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) return 1;

        // the first element in the array will always be unique,
        // because the array is sorted in non-decreasing order
        // so placed the slow n fast pointers from 2nd element in array
        int unique = 1;
        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow++] = nums[fast];
                unique++;
            }
        }
        return unique;
    }
}
