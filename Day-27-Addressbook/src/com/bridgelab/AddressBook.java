package com.bridgelab;


import java.util.Iterator;

public class AddressBook {
    static Set<Contact> contacts;
    public AddressBook()
    {
        contacts= new TreeSet<Contact>();
    }

    public static void main(String a[])
    {
        AddressBook ob=new AddressBook();
        contacts.add(new Contact("shashank","mani",880456788));
        contacts.add(new Contact("rahul","sharma",900450678));

        Iterator it=contacts.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}
