package P12.q1atm;

public class ATM {
	private String accountHolder;
	private String accountNumber;
	private double balance;

	public ATM(String accountHolder, String accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be greater than 0.");
		}

		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
		}

		if (amount > balance) {
			throw new IllegalStateException("Insufficient balance");
		}

		balance -= amount;
	}

	public void displayBalance() {
		System.out.println("Remaining Balance: ₹" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Initial Balance: ₹" + balance);
	}
}
