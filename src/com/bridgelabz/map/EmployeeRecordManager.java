package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EmployeeRecordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, EmployeeRecord> map = new HashMap<>();


        map.put(101, new EmployeeRecord(101, "Anni", "development"));
        map.put(102, new EmployeeRecord(102, "khushi", "Manager"));
        map.put(103, new EmployeeRecord(103, "Nitish", "Research"));
        map.put(104, new EmployeeRecord(104, "Alice", "development"));


        System.out.println("Enter id you wanna search:");
        int searchId = sc.nextInt();
        System.out.println(map.get(searchId));

    }


}
