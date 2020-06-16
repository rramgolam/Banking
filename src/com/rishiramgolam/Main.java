package com.rishiramgolam;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Java");

        bank.addBranches("Negara");
        bank.addCustomer("Negara", "Billy Mitchell", 10000.50);
        bank.addCustomer("Negara", "Jim Jordan", 20000.75);
        bank.addCustomer("Negara", "Billy Michaels", 3000.75);

        bank.addBranches("Rakyat");
        bank.addCustomer("Rakyat", "Holly Willis", 10000.50);
        bank.addCustomer("Rakyat", "Janice Bellews", 20000.75);
        bank.addCustomer("Rakyat", "Matt Gammon", 3000.75);

        bank.addCustomerTransaction("Rakyat", "Holly Willis", 500);
        bank.addCustomerTransaction("Rakyat", "Holly Willis", 34);
        bank.addCustomerTransaction("Rakyat", "Janice Bellews", 1200);
        bank.addCustomerTransaction("Negara", "Billy Mitchell", 500);
        bank.addCustomerTransaction("Negara", "Jim Jordan", 34);
        bank.addCustomerTransaction("Negara", "Billy Michaels", 1200);

        bank.listCustomers("Negara", true);
        bank.listCustomers("Rakyat", true);

        bank.getCustomerBalance("Negara", "Jim Jordan");
        bank.getCustomerBalance("Rakyat", "Holly Willis");

    }
}
