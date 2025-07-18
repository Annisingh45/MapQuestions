package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;


public class FrequencyCounter {
    public static void main(String[] args) {
        String s = "I am learning collection framework";
        countCharacterFrequency(s);
    }

    private static void countCharacterFrequency(String s) {
        if (s == null) {
            System.out.println("your input is null: ");
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char var : ch) {
            map.put(var, map.getOrDefault(var, 0) + 1);
        }
        System.out.println("Printing character frequency:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
