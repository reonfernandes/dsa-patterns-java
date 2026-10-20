package com.reon.arrays;

public class LeetCode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (s1.isEmpty()) return true;

        int start = 0;
        int end = s1.length() - 1;

        while (start < end) {
            if (s1.charAt(start) != s1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
