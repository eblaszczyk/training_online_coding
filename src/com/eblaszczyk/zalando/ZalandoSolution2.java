package com.eblaszczyk.zalando;


public class ZalandoSolution2 {

    public int solution(String S) {

        String [] tab = S.split("");
        int max = Integer.valueOf(tab[0])*10 + Integer.valueOf(tab[1]);
        int tmp = 0;

        if(tab.length == 2)
            return max;

        for(int i=1; i<S.length()-1;i++){
            tmp = Integer.valueOf(tab[i])*10 + Integer.valueOf(tab[i+1]);
            if(tmp>max){
                max = tmp;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new ZalandoSolution2().solution("50612309"));
    }
}
