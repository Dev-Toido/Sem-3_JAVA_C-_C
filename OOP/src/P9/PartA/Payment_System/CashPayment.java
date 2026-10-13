package P9.PartA.Payment_System;

class CashPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Cash");
	}
}