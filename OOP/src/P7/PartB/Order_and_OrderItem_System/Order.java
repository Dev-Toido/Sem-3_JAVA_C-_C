package P7.PartB.Order_and_OrderItem_System;

import java.util.ArrayList;

class Order {
	int orderId;
	String customerName;
	ArrayList<OrderItem> items = new ArrayList<>();

	Order(int orderId, String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
	}

	void addItem(OrderItem item) {
		items.add(item);
	}

	void removeItem(OrderItem item) {
		items.remove(item);
	}

	double calculateTotalAmount() {
		double total = 0;

		for (OrderItem item : items) {
			total += item.calculateItemTotal();
		}

		return total;
	}

	void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println();

		for (OrderItem item : items) {
			item.displayItemDetails();
			System.out.println();
		}

		System.out.println("Total Amount: " + calculateTotalAmount());
	}
}