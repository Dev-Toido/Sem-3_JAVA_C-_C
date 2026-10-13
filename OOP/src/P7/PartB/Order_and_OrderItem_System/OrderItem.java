package P7.PartB.Order_and_OrderItem_System;
class OrderItem {
	int productId;
	String productName;
	double price;
	int quantity;

	OrderItem(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	double calculateItemTotal() {
		return price * quantity;
	}

	void displayItemDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Item Total: " + calculateItemTotal());
	}
}