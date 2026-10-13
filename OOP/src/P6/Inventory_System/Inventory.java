package P6.Inventory_System;
class Inventory {
	private String productName;
	private double price;
	private int stockQuantity;

	public void setProductName(String productName) {
		if (productName != null && !productName.trim().isEmpty())
			this.productName = productName;
		else
			System.out.println("Invalid Product Name");
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("Invalid Price");
	}

	public void setStockQuantity(int stockQuantity) {
		if (stockQuantity >= 0)
			this.stockQuantity = stockQuantity;
		else
			System.out.println("Invalid Stock Quantity");
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}
}

