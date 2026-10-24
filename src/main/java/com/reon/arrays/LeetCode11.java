package com.reon.arrays;

public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        LeetCode11 code11 = new LeetCode11();

        int ans = code11.maxArea(height);
        System.out.println("Ans: " + ans);
    }
    public int maxArea(int[] height) {
        int maxWater = 0, start = 0, end = height.length - 1;
        while (start < end) {
            // current water in container = width(horizontal) * height(minimum)
            int currentWater = (end - start) * Math.min(height[start], height[end]);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }

            if (currentWater > maxWater) {
                maxWater = currentWater;
            }
        }
        return maxWater;
    }
}