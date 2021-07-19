package com.eblaszczyk.leetcode._1_50.easy;

public class L28ImplementIndexOf {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;

        if (haystack.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < haystack.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new L28ImplementIndexOf().strStr("hello", "ll"));
    }
}
