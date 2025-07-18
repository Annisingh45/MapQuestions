package com.bridgelabz.map;

public class PhoneBook {
    private int phoneNumber;
    private String name;

    public PhoneBook(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
