package com.eblaszczyk.leetcode._1_50.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L184Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int start = i+1;
                int end = nums.length-1;
                while(start<end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (sum == 0) {
                        List<Integer> tmp = new LinkedList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);

                        result.add(tmp);
                        int startVal = nums[start];
                        int endVal = nums[end];

                        while (start < end && startVal == nums[start]) {
                            start++;
                        }
                        while (end > start && endVal == nums[end]) {
                            end--;
                        }
                    } else if (sum < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
