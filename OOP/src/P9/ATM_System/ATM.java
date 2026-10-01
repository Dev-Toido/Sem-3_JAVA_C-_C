package P9.ATM_System;

public abstract class ATM {
	int balance;
	abstract void withdraw(int amount);
	abstract void deposit(int amount);
	abstract void checkBalance();
	void displayMessage() {
		System.out.println("Welcome to ATM");
	}
}
