package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 1, 3};
        // Create a HashMap to store counts
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Print duplicates and their counts
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }
}


