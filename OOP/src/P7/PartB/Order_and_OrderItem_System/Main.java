package P7.PartB.Order_and_OrderItem_System;

public class Main {
	public static void main(String[] args) {
		Order order = new Order(1001, "Vivek");

		OrderItem i1 = new OrderItem(101, "Laptop", 60000, 1);
		OrderItem i2 = new OrderItem(102, "Mouse", 1000, 2);
		OrderItem i3 = new OrderItem(103, "Keyboard", 2000, 1);

		order.addItem(i1);
		order.addItem(i2);
		order.addItem(i3);

		order.displayOrderDetails();

		order.removeItem(i2);

		System.out.println("\nAfter Removing Mouse:");
		order.displayOrderDetails();
	}
}