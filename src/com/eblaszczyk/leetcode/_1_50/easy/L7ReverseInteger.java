package com.eblaszczyk.leetcode._1_50.easy;

public class L7ReverseInteger {

    public int reverse(int x) {
        int result=0;

        int helper = 1;

        if (x == Integer.MIN_VALUE){
            return 0;
        }

        while (Math.abs(x / helper) >= 10) {
            helper *= 10;
        }
        int digit;
        int tmp=0;

        while(Math.abs(x)>=1){
            digit = x%10;
            tmp = 10*result + digit;
            if(result != (tmp-digit)/10){
                return 0;
            }
            result = tmp;
            x/=10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L7ReverseInteger().reverse(-321));
        System.out.println(new L7ReverseInteger().reverse(1534236469));
    }
}
