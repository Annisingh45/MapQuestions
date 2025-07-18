package com.bridgelabz.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

        public static List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : nums) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
            List<Integer>[] buckets = new List[nums.length + 1];
            for (int i = 0; i <= nums.length; i++) {
                buckets[i] = new ArrayList<>();
            }
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int freq = entry.getValue();
                buckets[freq].add(entry.getKey());
            }
            List<Integer> result = new ArrayList<>();
            for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
                result.addAll(buckets[i]);
            }
            return result.subList(0, k);
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 1, 2, 2, 3};
            int k = 2;
            System.out.println("Top " + k + " frequent elements: " + topKFrequent(nums, k));
        }

}
