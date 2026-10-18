package P12.q3banking;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("A101", "Harsh", 20000);

		account.displayAccountDetails();

		try {
			account.deposit(5000);
			account.checkBalance();
		} catch (InvalidAmountException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			account.withdraw(8000);
			account.checkBalance();
		} catch (InvalidAmountException | InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			account.withdraw(30000);
			account.checkBalance();
		} catch (InvalidAmountException | InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}