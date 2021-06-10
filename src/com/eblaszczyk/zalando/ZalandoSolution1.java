package com.eblaszczyk.zalando;

public class ZalandoSolution1 {


    public int solution(int[] A) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        boolean changed;

        for(int i =1;i<A.length-1;i++){
            changed = false;
            if(A[i] < first){
                first = A[i];
                changed = true;
            }
            else if(A[i]<second && !changed){
                second = A[i];
            }
        }

        return first + second;
    }

    public static void main(String[] args) {
        System.out.println(new ZalandoSolution1().solution(new int[]{5,2,1,2,1,7}));
    }
}
