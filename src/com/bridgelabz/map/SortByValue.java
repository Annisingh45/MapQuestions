package com.bridgelabz.map;

import java.util.*;

public class SortByValue {
    public static void main(String[] args) {
        // Sample HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Mango", 30);
        map.put("Grapes", 20);

        // Sort and get the result
        Map<String, Integer> sortedMap = sortByValues(map);

        // Print sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        // Convert map entries to list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list based on values
        list.sort(Map.Entry.comparingByValue());

        // LinkedHashMap to preserve sorted order
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
