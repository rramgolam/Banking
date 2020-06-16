package com.rishiramgolam;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    public boolean newCustomer(String name, double amount) {
        if (!findCustomer(name)) {
            customers.add(new Customer(name,amount));
            return true;
        } else {
            // already here
            System.out.println("Customer already exists.");
            return false;
        }
    }

    public void addTransaction(Customer customer, double amount) {

        if (findCustomer(customer.getName())) {

            int indexOfCustomer = customers.indexOf(customer);
            customers.get(indexOfCustomer).addTransaction(amount);

        } else {
            System.out.println("Sorry, customer not found.");
        }
    }

    public boolean addCustomerTransaction(String name, double amount) {

        if (findCustomer(name)) {
            getCustomer(name).addTransaction(amount);
            return true;
        } else {
            System.out.println("Sorry, customer not found");
            return false;
        }
    }

    public boolean findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) return true;
        }
        return false;
    }

    public Customer getCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) return customer;
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer name " + customer.getName());
        }
    }

    public void printAllCustomersAllTransactions() {
        for (Customer customer : customers) {
            System.out.println("Customer name " + customer.getName());

            for (Double transaction : customer.getTransactions()) {
                System.out.println("\t " + transaction);
            }
        }
    }

    public boolean printCustomerBalance(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) customer.printBalance();
            return true;
        }
        return false;
    }

}
