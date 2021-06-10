package com.eblaszczyk.leetcode;

import java.util.Arrays;
import java.util.List;
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

public class L2AddTwoNumbers {


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(-1);
        ListNode result = fakeHead;
        int toAdd = 0;

        while (!(l1== null && l2==null)){
            int v1 = 0;
            int v2 =0;

            if(l1 != null){
               v1 = l1.val;
               l1 = l1.next;
            }
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }

            int tmp = v1 + v2 + toAdd;

            ListNode newNode = new ListNode(tmp%10);
            result.next = newNode;
            result = newNode;
            toAdd = tmp /10;
        }
        if (toAdd > 0){
            result.next = new ListNode(toAdd);
        }

        return fakeHead.next;
    }

    public static void main(String[] argv) {

    }

}
