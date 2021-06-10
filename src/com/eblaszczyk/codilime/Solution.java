package com.eblaszczyk.codilime;

import java.util.Arrays;

public class Solution {

    public String[] getWords(String input) {

        String tmp = input.replaceAll("[^A-Za-z0-9 ]", " ")
                .replaceAll("\\s{2,}", " ").trim();

        String[] result = tmp.split(" ");

        return result;
    }

    public static void main(String[] args) throws Exception {
        String input = "Lorem, Ipsum? Ola ma!kota = One two.";

        System.out.println(Arrays.toString(new Solution().getWords(input)));

        // Your solution here...

        // Expected output [Lorem, Ipsum, Ola, ma, kota, One, two]
    }
}
