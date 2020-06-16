package com.rishiramgolam;

import java.util.ArrayList;

public class Bank {

    private String name = "Bank of Java";
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranches(String branchName) {
        if (findBranch(branchName) == null) {
            // no existing branches found
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initalAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName,initalAmount);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName,amount);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            if (showTransactions) {
                branch.printAllCustomersAllTransactions();
                return true;
            }
            branch.printAllCustomers();
            return true;
        }
        return false;
    }

    public boolean getCustomerBalance(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.getCustomer(customerName).printBalance();
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equals(branchName)) return branch;
        }

        return null;
    }

    public String getName() {
        return name;
    }
}
