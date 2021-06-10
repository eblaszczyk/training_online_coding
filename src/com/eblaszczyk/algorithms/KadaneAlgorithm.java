package com.eblaszczyk.algorithms;

public class KadaneAlgorithm {

    public int solution(int A[]){
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
        int localMax = 0;


        for(int i=0; i<A.length;i++){
            localMax = Math.max(A[i], localMax+A[i]);
            if(localMax>globalMax){
                globalMax = localMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println(new KadaneAlgorithm().solution(new int[]{-2,-3,4,-1,-2,1,5,-3}));
    }
}
/*
Maximum Subarray Problem
 */