package com.bridgelabz.map;

import java.time.LocalDate;
import java.util.List;

public class PolicyManagerMainClass {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Create sample policies
        Policy policy1 = new Policy("P1001", "John Doe", LocalDate.now().plusDays(10), "Health", 1200.50);
        Policy policy2 = new Policy("P1002", "Jane Smith", LocalDate.now().plusDays(40), "Auto", 800.00);
        Policy policy3 = new Policy("P1003", "Alice Brown", LocalDate.now().plusDays(25), "Life", 1500.75);
        Policy policy4 = new Policy("P1004", "Bob White", LocalDate.now().minusDays(5), "Travel", 600.00); // expired

        // Add policies
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);

        System.out.println("All policies:");
        manager.printAllPolicies();

        System.out.println("\nRetrieve policy by number (P1002):");
        Policy found = manager.getPolicyByNumber("P1002");
        System.out.println(found);

        System.out.println("\nPolicies expiring within 30 days:");
        List<Policy> expiring = manager.getExpiringPoliciesWithin30Days();
        for (Policy p : expiring) {
            System.out.println(p);
        }

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\nAll policies after removing expired:");
        manager.printAllPolicies();
    }
}