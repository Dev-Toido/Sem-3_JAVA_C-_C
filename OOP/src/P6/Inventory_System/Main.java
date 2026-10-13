package P6.Inventory_System;

public class Main {
	public static void main(String[] args) {
		Inventory i = new Inventory();

		i.setProductName("Laptop");
		i.setPrice(65000);
		i.setStockQuantity(10);

		System.out.println("Product: " + i.getProductName());
		System.out.println("Price: " + i.getPrice());
		System.out.println("Stock: " + i.getStockQuantity());
	}
}