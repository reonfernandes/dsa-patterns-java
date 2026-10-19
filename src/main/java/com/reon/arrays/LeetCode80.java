package com.reon.arrays;

public class LeetCode80 {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

        LeetCode80 code = new LeetCode80();
        int ans = code.removeDuplicates(nums);
        System.out.println("ans: " + ans);
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2;
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
