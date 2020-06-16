package com.rishiramgolam;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount ){
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean printBalance() {
        if (!transactions.isEmpty()) {
            int sum = 0;
            for (Double payment : transactions) {
                sum += payment;
            }
            System.out.println("Customer : " + this.name + " \tBalance : " + sum);
            return true;
        }
        return false;
    }

}
