package P12.q2pin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ATMUser user = new ATMUser("Harsh", "A101", 2580);
		boolean verified = false;

		for (int attempt = 1; attempt <= 3; attempt++) {
			System.out.print("Enter PIN: ");
			int enteredPIN = sc.nextInt();

			try {
				user.verifyPIN(enteredPIN);
				System.out.println("PIN verified successfully");
				verified = true;
				break;
			} catch (InvalidPINException e) {
				System.out.println(e.getMessage());

				if (attempt == 3) {
					System.out.println("Account temporarily blocked");
				}
			}
		}

		sc.close();
	}
}