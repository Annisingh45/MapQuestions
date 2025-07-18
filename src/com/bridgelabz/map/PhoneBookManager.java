package com.bridgelabz.map;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBookManager {
    private TreeMap<String,PhoneBook> contacts =new TreeMap<>();

    //Add a contact
    public void addContact(String name,int phoneNumber)
    {
        contacts.put(name,new PhoneBook(phoneNumber,name));
    }
    //Remove a contact by name
    public PhoneBook removeContact(String name)
    {
        return contacts.remove(name);
    }
    //search for a contact by name
    public PhoneBook searchContact(String name){

        return contacts.get(name);
    }
    //List all contacts
    public void listContacts()
    {
        for(Map.Entry<String,PhoneBook> entry:contacts.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
