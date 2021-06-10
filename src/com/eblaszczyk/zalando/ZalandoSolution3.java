package com.eblaszczyk.zalando;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ZalandoSolution3 {

    public int solution(String S) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) ->
                Integer.compare(y, x));

        for (Character c : S.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> it : map.entrySet()) {
            queue.add(it.getValue());
        }

        while (!queue.isEmpty()) {
            int frequent = queue.peek();
            queue.remove();
            if (queue.isEmpty()) {
                return count;
            }
            if (frequent == queue.peek()) {
                if (frequent > 1) {
                    queue.add(frequent - 1);
                }
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new ZalandoSolution3().solution("aaabbb"));
        System.out.println(new ZalandoSolution3().solution("example"));
    }
}
