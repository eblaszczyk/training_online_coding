package com.eblaszczyk.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Result {

    public static List<String> processLogs(List<String> logs, int threshold) {

        Map<String, Integer> map = new HashMap<>();

        logs.forEach(l -> {
            String[] log = l.split(" ");
            putOrIcrementCounter(log[0], map) ;
            putOrIcrementCounter(log[1], map);
            }
        );

        List<Integer> result = new LinkedList<>();

        map.entrySet().forEach(e->{
            if(e.getValue()>= threshold){
                result.add(Integer.parseInt(e.getKey()));
            }
        });

        Collections.sort(result);

        return result.stream().map(i -> i.toString()).collect(Collectors.toList());
    }

    private static void putOrIcrementCounter(String user, Map<String, Integer> map){
        map.merge(user, 1, Integer::sum);
    }

    public static void main(String[] argv) {

        List<String> logs = Arrays.asList( "2 23 50", "2 7 70", "23 3 20", "2 2 17");

        List<String> result = Result.processLogs(logs,2);

        result.stream().forEach(r -> System.out.println(r));

//     Map<String,Integer> result = new Solution().countDomainsUsage(counts);

//     for(Map.Entry<String,Integer> e : result.entrySet()){
//       System.out.println(e.getKey()+ ": " + e.getValue());
//     }
    }
}
