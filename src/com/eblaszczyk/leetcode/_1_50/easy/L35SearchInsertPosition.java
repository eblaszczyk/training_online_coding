package com.eblaszczyk.leetcode._1_50.easy;

public class L35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if(nums.length ==0 || nums[0]>=target)
            return 0;

        for (int i=0; i< nums.length-1; i ++){
            if(nums[i] == target){
                return i;
            } else if( nums[i]<target && nums[i+1]>= target){
                return i+1;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new L35SearchInsertPosition().searchInsert(new int[]{1,3},3));
    }
}
