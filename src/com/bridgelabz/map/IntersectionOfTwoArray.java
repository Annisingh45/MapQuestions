package com.bridgelabz.map;

import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 8, 9, 3};
        int[] b = {5, 20, 90, 76, 23};

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i : a) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : b) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        List<Integer> intersection = findIntersection(map1, map2);
        System.out.println("Intersection: " + intersection);
    }

    private static List<Integer> findIntersection(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultList.add(key);
            }
        }
        return resultList;
    }
}