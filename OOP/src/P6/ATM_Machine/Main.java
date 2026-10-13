package P6.ATM_Machine;
public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM();

		atm.deposit(10000);
		atm.withdraw(3000);

		System.out.println("Balance: " + atm.getBalance());
	}
}