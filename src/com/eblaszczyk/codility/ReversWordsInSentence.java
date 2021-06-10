package com.eblaszczyk.codility;

import java.util.Arrays;

public class ReversWordsInSentence {

    public static char[] reverseWords(char[] input) {
        int beginOfWorldIndex = -1;
        int endOfWorldIndex = -1;

        if (input == null || input.length <= 1)
            return input;

        for (int i = 0; i < input.length; i++) {
            if (beginOfWorldIndex == -1 && input[i] != ' ') {
                beginOfWorldIndex = i;
            } else if (beginOfWorldIndex != -1 && endOfWorldIndex == -1 && input[i] == ' ') {
                endOfWorldIndex = i;
            } else if (beginOfWorldIndex != -1 && endOfWorldIndex == -1 && i == input.length - 1) {
                endOfWorldIndex = input.length;
            }

            if (beginOfWorldIndex != -1 && endOfWorldIndex != -1) {
                reverseWord(input, beginOfWorldIndex, endOfWorldIndex);
                beginOfWorldIndex = -1;
                endOfWorldIndex = -1;
            }
        }

        return input;
    }

    private static void reverseWord(char[] input, int beginOfWorldIndex, int endOfWorldIndex) {
        int worldLength = endOfWorldIndex - beginOfWorldIndex;

        for (int i = 0; i < worldLength / 2; i++) {
            char tmp = input[endOfWorldIndex - i - 1];
            input[endOfWorldIndex - i - 1] = input[beginOfWorldIndex + i];
            input[beginOfWorldIndex + i] = tmp;
        }
    }


    public static void main(String[] args) {
        char [] in = new char[]{'q'};
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(ReversWordsInSentence.reverseWords(in)));
    }
}
