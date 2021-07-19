package com.eblaszczyk.leetcode._1_50.easy;

public class L26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if(nums.length <= 1)
            return nums.length;

        int freeIndex = 1;
        int currentElem = nums[0];

        for(int i =1; i<nums.length; i++){
            if(currentElem != nums[i] && i==freeIndex){
                freeIndex ++;
                currentElem = nums[i];
            } else if(currentElem != nums[i] && i>freeIndex){
                currentElem = nums[i];
                nums[freeIndex] = nums[i];
                freeIndex++;
            }
        }
        return freeIndex;
    }

    public static void main(String[] args) {
        System.out.println(new L26RemoveDuplicatesFromSortedArray()
                .removeDuplicates( new int[]{1,1,2,2,2,3,4,5}));
    }
}
