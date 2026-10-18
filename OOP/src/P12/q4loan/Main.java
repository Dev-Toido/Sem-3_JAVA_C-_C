package P12.q4loan;

public class Main {
	public static void main(String[] args) {
		Customer eligibleCustomer = new Customer("Asha", 24, 50000, 750);
		Customer ineligibleCustomer = new Customer("Rahul", 25, 30000, 620);

		try {
			eligibleCustomer.checkLoanEligibility();
		} catch (LoanEligibilityException e) {
			System.out.println("Loan Eligibility Failed: " + e.getMessage());
		}

		try {
			ineligibleCustomer.checkLoanEligibility();
		} catch (LoanEligibilityException e) {
			System.out.println("Loan Eligibility Failed: " + e.getMessage());
		}
	}
}