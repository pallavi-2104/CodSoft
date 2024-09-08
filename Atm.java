package com.atm;

import java.util.Scanner;

public class Atm {
    private bankAccount userAccount;
    private Scanner scanner;

    public Atm(bankAccount userAccount) {
        this.userAccount = userAccount;
        this.scanner = new Scanner(System.in);
    }

    // ATM menu options
    public void displayMenu() {
    	System.out.println("********WELCOME*********");
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

   
    public void handleUserInput() {
        int choice;

        do {
            displayMenu();
          
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleWithdraw();
                    break;
                case 2:
                    handleDeposit();
                    break;
                case 3:
                    System.out.println("Current Balance: ₹" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Goodbye.......!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
    }

    //  withdrawal operations
    private void handleWithdraw() {
        System.out.print("Enter the amount to withdraw: ₹");
        double withdrawAmount = scanner.nextDouble();
        boolean success = userAccount.withdraw(withdrawAmount);
        displayTransactionResult(success);
    }

    // deposit operations
    private void handleDeposit() {
        System.out.print("Enter the amount to deposit: ₹");
        double depositAmount = scanner.nextDouble();
        userAccount.deposit(depositAmount);
        System.out.println("Deposit successful. Current balance: ₹" + userAccount.getBalance());
    }

    // the withdrawal transaction
    private void displayTransactionResult(boolean success) {
        if (success) {
            System.out.println("Withdrawal successful. Current balance: ₹" + userAccount.getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}
