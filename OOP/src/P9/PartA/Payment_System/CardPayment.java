package P9.PartA.Payment_System;
class CardPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Card");
	}
}
