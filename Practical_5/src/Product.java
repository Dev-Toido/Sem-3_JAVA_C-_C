class Product {
    int productId;
    String name;
    String category;
    int stock;

    // Constructor
    Product(int productId, String name, String category, int stock) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    // Display method
    void display() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Category: " + category + ", Stock: " + stock);
    }
}