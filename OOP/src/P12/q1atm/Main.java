package P12.q1atm;

public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM("Harsh", "A101", 10000);

		atm.displayAccountDetails();

		try {
			atm.withdraw(3000);
			System.out.println("Withdrawal successful");
			atm.displayBalance();
		} catch (IllegalArgumentException | IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			atm.withdraw(15000);
			System.out.println("Withdrawal successful");
		} catch (IllegalArgumentException | IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
			atm.displayBalance();
		}

		try {
			atm.deposit(5000);
			System.out.println("Deposit successful");
			atm.displayBalance();
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
