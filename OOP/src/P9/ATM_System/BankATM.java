package P9.ATM_System;

public class BankATM extends ATM {
	BankATM(int balance) {
		this.balance = balance;
	}
	public void displayMessage() {
		System.out.println("Welcome to BankATM");
	}
	void withdraw(int amount) {
	if(balance >= amount) {
		balance -= amount;
		System.out.println("Withdraw Successful");
	}
	else {
		System.out.println("Withdraw Failed due to insufficient balance");
	}
	}
	void deposit(int amount) {
		balance += amount;
		System.out.println("Deposit Successful");
	}
	void checkBalance() {
		System.out.println("Balance is " + balance);
	}
}
