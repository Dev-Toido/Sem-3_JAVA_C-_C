package P9.ATM_System;

public class Main {
	public static void main(String[] args) {
		ATM mach = new BankATM(5000);
		mach.displayMessage();
		mach.checkBalance();
		mach.withdraw(3500);
		mach.checkBalance();
		mach.deposit(500);
		mach.checkBalance();


	}
}