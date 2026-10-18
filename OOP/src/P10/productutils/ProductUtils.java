package P10.productutils;

public class ProductUtils {
	public static double calculateTotalPrice(Product[] products) {
		if (products == null || products.length == 0)
			return 0;

		double total = 0;

		for (Product product : products) {
			total += product.getPrice();
		}

		return total;
	}

	public static Product findMostExpensiveProduct(Product[] products) {
		if (products == null || products.length == 0)
			return null;

		Product mostExpensive = products[0];

		for (Product product : products) {
			if (product.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = product;
			}
		}

		return mostExpensive;
	}
}
