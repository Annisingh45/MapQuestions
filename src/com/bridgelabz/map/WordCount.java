package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String s = "Although it was raining heavily outside, Sarah decided to go for a walk in the park because she loved the sound of raindrops hitting the leaves, the fresh earthy smell that filled the air, and the peaceful solitude that rain often brought, making everything seem quieter and more thoughtful; she wore her favorite yellow raincoat, matching boots, and carried a red umbrella, smiling as she stepped into puddles, waved at passing strangers, watched birds shelter under branches, and remembered her childhood days spent dancing in the rain with her siblings, back when joy came from simple, beautiful, unexpected moments like this.";
        countWordOccurrences(s);
    }

    private static void countWordOccurrences(String s) {
        if (s == null) {
            System.out.println("Your input is null");
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        //String[] words = s.toLowerCase().split("\\W+"); // Split on non-word characters
        String[] words = s.toLowerCase().split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word occurrences:");


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}