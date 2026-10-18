package P10.productutils;
public class Product {
	private int productId;
	private String productName;
	private String category;
	private double price;

	public Product(int productId, String productName, String category, double price) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", category='" + category + '\'' +
				", price=" + price +
				'}';
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Product product = (Product) obj;
		return productId == product.productId;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(productId);
	}
}
