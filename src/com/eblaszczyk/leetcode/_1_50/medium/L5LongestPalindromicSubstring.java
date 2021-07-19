package com.eblaszczyk.leetcode._1_50.medium;

import java.util.Arrays;

public class L5LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String longest ="";

        for(int i=0; i<s.length();i++){
            String tmp;
            tmp = palindromCenterBy(s,i, i);
            if(tmp.length()> longest.length()){
                longest = tmp;
            }
            tmp = palindromCenterBy(s,i, i+1);
            if(tmp.length()> longest.length()){
                longest = tmp;
            }
        }

        return longest;
    }

    private String palindromCenterBy(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }

    public static void main(String[] args) {
        System.out.println(new L5LongestPalindromicSubstring().longestPalindrome("aaabbbaaa"));
    }
}
