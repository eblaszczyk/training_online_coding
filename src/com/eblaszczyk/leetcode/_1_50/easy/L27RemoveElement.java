package com.eblaszczyk.leetcode._1_50.easy;

public class L27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start =0, end = nums.length-1;

        while (start<=end){
            if(nums[start] != val){
                start++;
                continue;
            }
            if(nums[end] == val){
                end --;
                continue;
            }
            nums[start]=nums[end];
            start++;
            end--;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(new L27RemoveElement().removeElement(new int[]{1,2,1,2,3,4,5,2}, 2));
    }
}
