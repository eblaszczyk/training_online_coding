package com.eblaszczyk.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L15Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {
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

    public static void main(String[] args) {
        List<List<Integer>> result = new L15Sum3().threeSum(new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49});

        for(List<Integer> l : result){
            System.out.println(Arrays.toString(l.toArray()));
        }
    }

}
