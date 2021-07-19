package com.eblaszczyk.leetcode._1_50.easy;

public class L14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String result = "";
        if (strs.length == 1) {
            return strs[0];
        }

        int currentChar = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < currentChar + 1 ||
                        strs[0].charAt(currentChar) != strs[j].charAt(currentChar)) {
                    return result;
                }
            }
            result += strs[0].charAt(currentChar++);
        }
        return result;

    }

    public static void main(String[] args) {
        L14LongestCommonPrefix prefix = new L14LongestCommonPrefix();

        System.out.println(prefix.longestCommonPrefix(new String[]{"", "aa"}));
        System.out.println(prefix.longestCommonPrefix(new String[]{"abcd", "abeee", "abeee"}));
    }
}
