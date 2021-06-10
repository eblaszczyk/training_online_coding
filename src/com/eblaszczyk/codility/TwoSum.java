package com.eblaszczyk.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int output[] = new int[2];
        Map<Integer, Integer> occ = new HashMap<>();

        for(int i=0;i<nums.length; i++){
            if(occ.containsKey(target-nums[i])){
                output[0] = occ.get(target-nums[i]);
                output[1] = i;
            }
            else {
                occ.put(nums[i],i);
            }
        }

        return output;
    }

    public static void main(String[] argv) {

        List<String> logs = Arrays.asList("1100", "1110", "0110", "0001");

        System.out.println(Arrays.toString(
                new TwoSum().twoSum(new int[]{3, 1, 4, 3}, 6)));

        System.out.println(Arrays.toString(
                new TwoSum().twoSum(new int[]{3, 2, 4}, 6)));
    }
}
