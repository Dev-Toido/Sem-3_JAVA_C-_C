package P12.q5transaction;

public class BankTransaction {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankTransaction(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}

		balance += amount;
		System.out.println("Deposit successful. Balance: ₹" + balance);
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
		System.out.println("Withdrawal successful. Balance: ₹" + balance);
	}

	public void transfer(BankTransaction receiver, double amount)
			throws InvalidAmountException, InsufficientBalanceException,
			InvalidAccountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}

		if (receiver == null || accountNumber.equals(receiver.accountNumber)) {
			throw new InvalidAccountException(
					"Sender and receiver accounts must be different.");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance.");
		}

		balance -= amount;
		receiver.balance += amount;

		System.out.println("Transfer successful. Remaining: ₹" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
}