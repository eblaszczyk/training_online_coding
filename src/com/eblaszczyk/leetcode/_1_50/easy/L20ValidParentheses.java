package com.eblaszczyk.leetcode._1_50.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class L20ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> machers = new HashMap<>();
        machers.put(')', '(');
        machers.put(']', '[');
        machers.put('}', '{');

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                chars.push(c);
            } else {
                if (chars.isEmpty() || chars.pop() != machers.get(c)) {
                    return false;
                }
            }
        }
        return chars.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new L20ValidParentheses().isValid("()[]{}"));
    }
}
