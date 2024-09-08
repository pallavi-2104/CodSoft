package com.atm;
public class Main {

           public static void main(String[] args) {
	        //  initial balance of ₹5000
	        bankAccount userAccount = new bankAccount(5000.0);
	        Atm atm = new Atm(userAccount);
            atm.handleUserInput();
	    }
	}



