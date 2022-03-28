package com.company.utils;

public class BankAccount {
    private int id;
    private String name;
    private int balance;

    public BankAccount(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int deposit) {
        this.balance+=deposit;
        return balance;
    }

    public void debit(int subtract) {
        if(balance < subtract) {
            System.out.println("There is not enough money in the account to subtract the amount provided.");
        } else {
            this.balance-=subtract;
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ",nombre=" + name + ",balance=" + balance + "]";
    }
}
