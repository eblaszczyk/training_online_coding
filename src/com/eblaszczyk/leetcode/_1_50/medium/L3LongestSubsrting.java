package com.eblaszczyk.leetcode._1_50.medium;

import java.util.HashMap;

public class L3LongestSubsrting {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> helper = new HashMap<Character, Integer>();
        int start = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if(helper.containsKey(s.charAt(i))){
                start = Math.max(start, helper.get(s.charAt(i))+1);
            }
            max = Math.max(max, i-start+1);
            helper.put(s.charAt(i),i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println( new L3LongestSubsrting().lengthOfLongestSubstring("abcaewk"));
        System.out.println( new L3LongestSubsrting().lengthOfLongestSubstring("pwwkew"));
    }
}
