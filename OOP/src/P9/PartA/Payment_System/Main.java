package P9.PartA.Payment_System;

public class Main {
	public static void main(String[] args) {
		Payment p1 = new UPIPayment();
		Payment p2 = new CardPayment();
		Payment p3 = new CashPayment();

		p1.pay(500);
		p2.pay(1000);
		p3.pay(300);
	}
}