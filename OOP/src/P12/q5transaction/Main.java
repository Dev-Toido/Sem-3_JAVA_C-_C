package P12.q5transaction;

public class Main {
	public static void main(String[] args) {
		BankTransaction sender =
				new BankTransaction("A101", "Harsh", 50000);

		BankTransaction receiver =
				new BankTransaction("A102", "Rahul", 20000);

		try {
			sender.deposit(5000);
			sender.withdraw(5000);
		} catch (InvalidAmountException | InsufficientBalanceException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

		try {
			sender.transfer(receiver, 10000);
			System.out.println("Receiver Balance: ₹" + receiver.getBalance());
		} catch (InvalidAmountException | InsufficientBalanceException
		         | InvalidAccountException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

		try {
			sender.transfer(receiver, 70000);
		} catch (InvalidAmountException | InsufficientBalanceException
		         | InvalidAccountException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

		try {
			sender.deposit(0);
		} catch (InvalidAmountException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

		try {
			sender.transfer(sender, 1000);
		} catch (InvalidAmountException | InsufficientBalanceException
		         | InvalidAccountException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}
	}
}