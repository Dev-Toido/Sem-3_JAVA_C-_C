package P12.q2pin;

public class ATMUser {
	private String accountHolder;
	private String accountNumber;
	private int pin;

	public ATMUser(String accountHolder, String accountNumber, int pin) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public void verifyPIN(int enteredPIN) throws InvalidPINException {
		if (enteredPIN != pin) {
			throw new InvalidPINException("Incorrect PIN");
		}
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}