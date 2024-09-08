
// TASK 3
//ATM INTERFACE
package com.atm;

public class bankAccount {
    private double balance;

    // Constructor 
    public bankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
