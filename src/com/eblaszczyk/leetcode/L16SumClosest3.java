package com.eblaszczyk.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L16SumClosest3 {

  public int threeSumClosest(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closest = 0;

        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int start = i+1;
                int end = nums.length-1;
                while(start<end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (Math.abs(sum - target)< min) {
                        min = Math.abs(sum - target);
                        closest = sum;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        System.out.println( new L16SumClosest3().threeSumClosest(new int[]{1,1,-1,-1,3}, 3));
    }

}
