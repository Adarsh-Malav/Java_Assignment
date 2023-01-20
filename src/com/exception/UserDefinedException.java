package com.exception;

import java.io.IOException;
import java.util.Scanner;

/*
 * ATM: Deposit : 2000
 * withdraw : 5000
 * if you enter 3000 more in your account you can withdraw 5000rs
 * 
 * throw : must used for user defined exception
 * 1. your user defined class must inherit Exception class then only it will become user defined Exception
 * 2. throw must be written inside method
 * 3. throw is followed by new keyboard and also constructor
 * 
 * throws : it is written at the time of method declaration
 * we can inherit user defined exception as well as system defined exception
 * we can inherit more then one exception using ","
 * 
 */
@SuppressWarnings("serial")
class AdarshException extends Exception{
	double amount;
	public AdarshException(double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+" rs deposited");
	}
	
	public void withdraw(double amount) throws AdarshException,IOException,InterruptedException {
		if (amount<balance) {
			System.out.println("you have withdraw "+amount+" rs");
			balance-=amount;
			System.out.println("remaining balance is "+balance);
		}
		
		else {
			double needs;
			needs=amount-balance;
			throw new AdarshException(needs);
		}
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	ATM atm=new ATM();
	double amount;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the amount to be deposited ");
	amount = scanner.nextDouble();
	atm.deposit(amount);
	
	System.out.println("Enter the amount to be withdrawn:");
	amount = scanner.nextDouble();
	
	scanner.close();
	
	try {
		atm.withdraw(amount);
	} catch (AdarshException e) {
		System.out.println("if you enter "+e.amount+" more in your account you can withdraw "+amount);
		e.printStackTrace();
	}catch (IOException e) {
		
		e.printStackTrace();
		
	}catch (InterruptedException e) {
	
	e.printStackTrace();
	}
	
}
}
