class Laptop {
    String brand;
    String model;
    int ram; // in GB
    int storage; // in GB

    // Constructor
    Laptop(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    // Display method
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
    }
}