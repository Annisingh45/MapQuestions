package com.bridgelabz.map;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private HashMap<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> orderPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expirySortedMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderPolicyMap.put(policy.getPolicyNumber(), policy);
        expirySortedMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String number) {
        return policyMap.get(number);
    }

    // Get policies expiring within 30 days
    public List<Policy> getExpiringPoliciesWithin30Days() {
        List<Policy> result = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate cutOff = now.plusDays(30);

        SortedMap<LocalDate, List<Policy>> subMap = expirySortedMap.subMap(now, true, cutOff, true);
        for (List<Policy> policyList : subMap.values()) {
            result.addAll(policyList);
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Policy> entry = iterator.next();
            if (entry.getValue().getExpiryDate().isBefore(now)) {
                iterator.remove();
                orderPolicyMap.remove(entry.getKey());
                List<Policy> expiryList = expirySortedMap.get(entry.getValue().getExpiryDate());
                if (expiryList != null) {
                    expiryList.remove(entry.getValue());
                    if (expiryList.isEmpty()) {
                        expirySortedMap.remove(entry.getValue().getExpiryDate());
                    }
                }
            }
        }
    }

    // Print all policies
    public void printAllPolicies() {
        for (Policy p : orderPolicyMap.values()) {
            System.out.println(p);
        }
    }
}