package com.eblaszczyk.leetcode._1_50.easy;

public class L9PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int left = 1;

        while (x / left >= 10) {
            left = left * 10;
        }

        int right = 1;

        while (left > right) {
            if ((x / left) % 10 != (x / right) % 10) {
                return false;
            }
            left = left / 10;
            right = right * 10;
        }
        return true;
    }

    public static void main(String[] args) {
        L9PalindromeNumber palindromeNumber = new L9PalindromeNumber();

        System.out.println(palindromeNumber.isPalindrome(123456));
        System.out.println(palindromeNumber.isPalindrome(-1234321));
        System.out.println(palindromeNumber.isPalindrome(1234321));
    }
}
