package P6.ATM_Machine;
class ATM {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
		else
			System.out.println("Invalid Deposit");
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance)
			balance -= amount;
		else
			System.out.println("Invalid Withdrawal");
	}

	public double getBalance() {
		return balance;
	}
}

