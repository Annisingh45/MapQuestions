package com.bridgelabz.map;

import java.util.Scanner;

public class PhoneBookMainClass {
    public static void main(String[] args) {
        PhoneBookManager pbm = new PhoneBookManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Phone Book Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. List All Contacts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone number:");
                    int phoneNumber = sc.nextInt();
                    pbm.addContact(name, phoneNumber);
                    System.out.println("Contact Added.");
                    break;

                case 2:
                    System.out.println("Enter name to be removed:");
                    String removeName = sc.nextLine();
                    PhoneBook removed = pbm.removeContact(removeName);
                    if (removed != null) {
                        System.out.println("Contact removed:" + removed);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter name to be search:");
                    String nameToSearch = sc.nextLine();
                    PhoneBook found = pbm.searchContact(nameToSearch);
                    if (found != null) {
                        System.out.println("Contact fount:" + found);

                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                    System.out.println("All contacts");
                    pbm.listContacts();

                case 5:
                    System.out.println("Exiting Phone Book ");
                    break;

                default:
                    System.out.println("Invalid choice");


            }


        }
        while (choice != 5);
    }
}
