package com.eblaszczyk.leetcode._1_50.medium;

public class L6ZigZagConversion {
    public String convert(String s, int numRows) {

        String [] helpers = new String[numRows];
        int row = 0;
        int delta = 1;
        String result = "";

        for(int i =0; i<numRows; i++){
            helpers[i] = "";
        }

        for(int i=0; i<s.length(); i++){
           char c = s.charAt(i);
           helpers[row] = helpers[row] + c;

            if(numRows>1){

                if(row == numRows-1){
                    delta =-1;
                }
                if(row==0){
                    delta = 1;
                }
                row= row + delta;
            }

        }

        for(String hel : helpers){
            result = result + hel;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L6ZigZagConversion().convert("AB", 1));
        //System.out.println(new L6ZigZagConversion().convert("PAYPALISHIRING", 4));
        //PINALSIGYAHRPI
        //PINALSIGYAHRPI
       // System.out.println(new L6ZigZagConversion().convert("PAYPALISHIRING", 3));
        //PAHNAPLSIIGYIR
        //PAHNAPLSIIGYIR

    }
}
