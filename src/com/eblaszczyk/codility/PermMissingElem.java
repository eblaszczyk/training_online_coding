package com.eblaszczyk.codility;


public class PermMissingElem {
    public int solution(int[] A){
        int l = A.length;
        boolean [] occ = new boolean[l +1];

        if(l==0){
            return 1;
        }

        for (int a : A){
            occ[a-1] = true;
        }

        int missing = 1;

        while(occ[missing]){
            missing++;
        }
        return  missing+1;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{1,2,3,5,6}));
        System.out.println(new PermMissingElem().solution(new int[]{}));
    }
}

/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */