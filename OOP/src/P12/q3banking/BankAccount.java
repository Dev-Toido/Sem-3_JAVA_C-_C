package P12.q3banking;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}

		balance += amount;
		System.out.println("Deposit successful.");
	}

	public void withdraw(double amount)
			throws InvalidAmountException, InsufficientBalanceException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance.");
		}

		balance -= amount;
		System.out.println("Withdrawal successful.");
	}

	public void checkBalance() {
		System.out.println("Balance: ₹" + balance);
	}

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		checkBalance();
	}
}