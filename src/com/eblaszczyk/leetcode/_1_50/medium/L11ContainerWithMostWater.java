package com.eblaszczyk.leetcode._1_50.medium;

public class L11ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right) {
            max = Math.max(max, Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new L11ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
