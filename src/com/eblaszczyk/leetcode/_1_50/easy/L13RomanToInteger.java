package com.eblaszczyk.leetcode._1_50.easy;

import java.util.HashMap;
import java.util.Map;

public class L13RomanToInteger {
    public int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        initMap(map);
        int result=0;

        for(int i=0;i<s.length(); i++){
            if(i>0 && map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                result= result-2 *map.get(s.charAt(i-1));
            }
            result = result + map.get(s.charAt(i));
        }
        return result;
    }

    private void initMap(Map<Character, Integer> map) {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    public static void main(String[] args) {
        System.out.println(new L13RomanToInteger().romanToInt("LVIII"));//58
    }

}
