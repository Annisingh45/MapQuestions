package com.bridgelabz.map;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, then convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add word to correct group in map
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Return all groups of anagrams (moved outside the loop)
        return new ArrayList<>(map.values());
    }
}