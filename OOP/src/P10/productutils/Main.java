package P10.productutils;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product(201, "Laptop", "Electronics", 65000);
		Product p2 = new Product(202, "Smartphone", "Electronics", 30000);
		Product p3 = new Product(203, "Monitor", "Electronics", 15000);
		Product p4 = new Product(204, "Keyboard", "Accessories", 2500);
		Product p5 = new Product(205, "Mouse", "Accessories", 1000);
		Product p6 = new Product(206, "Headphones", "Audio", 4000);
		Product p7 = new Product(207, "Camera", "Photography", 8000);
		Product p8 = new Product(201, "Laptop", "Electronics", 65000);

		Product[] products = {p1, p2, p3, p4, p5, p6, p7};

		System.out.println("=== Testing toString() ===");
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("\n=== Testing equals() ===");
		System.out.println("p1.equals(p8): " + p1.equals(p8));
		System.out.println("p1.equals(p2): " + p1.equals(p2));

		System.out.println("\n=== Testing hashCode() ===");
		System.out.println("p1.hashCode(): " + p1.hashCode());
		System.out.println("p8.hashCode(): " + p8.hashCode());

		System.out.println("\n=== Utility Methods ===");
		double total = ProductUtils.calculateTotalPrice(products);
		System.out.println("Total Inventory Value: " + total);

		Product expensive = ProductUtils.findMostExpensiveProduct(products);
		System.out.println("Most Expensive Product: " + expensive);
	}
}

