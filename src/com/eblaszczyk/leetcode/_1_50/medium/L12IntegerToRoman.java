package com.eblaszczyk.leetcode._1_50.medium;

import java.util.HashMap;
import java.util.Map;

public class L12IntegerToRoman {

    public String intToRoman(int num) {
        String result = "";

        int[] base = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] chars = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX", "V", "IV", "I"};
        int i = 0;


        while (num >0){
            while (num/base[i] >0) {
                result += chars[i];
                num = num - base[i];
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L12IntegerToRoman().intToRoman(12));
    }
}
/*
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */