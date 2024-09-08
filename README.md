// Task 1
// To Create Number Guess Game
package codsoft.com;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double random =Math.random()*(100-1+1)+1;
		int randm = (int)random;
		int guess = 0; 
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println(" Enter the number of Attempts");
		char option;
		int attempts = s.nextInt();
		int limit =0;
		int score = 0;
		
		
		 while(guess!= randm)
		 {
			 System.out.println("Enter the no:");
			 guess = s.nextInt ();
			 
			 if( guess == randm)
			 {
				 System.out.println("Congratulation!.....Your guess is correct");
				  score ++;
				   random =  Math.random()*100;
				   
				   randm = (int)random;
				   
			 } 
			 
			 else if (guess>=randm) 
			 {
				 System.out.println("Too High");
				 limit ++;
				 
			}else {
				System.out.println("Too Low");
				limit ++;
			}
			 if(limit >=attempts)
			 {
				 System.out.println(" Do you  want to play again? yes/No");
				 option = s.next().charAt(0);
				 
				 if(option =='y') {
					 
					 attempts ++;
					 
				}
				 else if (option =='n')
				 {
					 break;
					 
				 }
				 
			 }
		
		 }
		 attempts = attempts-1;
		 System.out.println("You Won" + " 1"+ score);
		 System.out.println("Your Attempts"+ " "+ attempts);
		 System.out.println("Congratulation!.....Your guess is correct");
	}

}


//Task 2
// STUDENTS GARADE CALCULATOR

package codesoft.com.task2;
import java.util.Scanner;



public class StudentMarksCalculator {

    public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the number of subjects: ");
		   int numberOfSubjects = scanner.nextInt();
           int[] marks = new int[numberOfSubjects];

			        
			        for (int i = 0; i < numberOfSubjects; i++) {
			            System.out.println("Ente the mark subject " + (i + 1) + ": ");
			            marks[i] = scanner.nextInt();
			        }

			        // total marks
			        int totalMarks = 0;
			        for (int mark : marks) {
			            totalMarks += mark;
			        }

			       // Average
			        float averagePercentage = (float) totalMarks / numberOfSubjects;
                    String grade;
			        if (averagePercentage >= 90) {
			            grade = "A";
			        } else if (averagePercentage >= 80) {
			            grade = "B";
			        } else if (averagePercentage >= 70) {
			            grade = "C";
			        } else if (averagePercentage >= 60) {
			            grade = "D";
			        } else {
			            grade = "F";
			        }

			        // Display  results
			        System.out.println("Total marks: " + totalMarks+"/"+(numberOfSubjects*100));
			        System.out.println("Average percentage: " + averagePercentage);
			        System.out.println("Grade: " + grade);
			        scanner.close();
			    }
			}


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
package com.atm;
public class Main {

           public static void main(String[] args) {
	        //  initial balance of ₹50001
        	   
	        bankAccount userAccount = new bankAccount(5000.0);
	        Atm atm = new Atm(userAccount);
            atm.handleUserInput();
	    }
	}



		


