class Mobile {
    String brand;
    String model;
    double price;
    int batteryCapacity; // in mAh

    // Constructor
    Mobile(String brand, String model, double price, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
    }

    // Display method
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: Rs" + price + ", Battery: " + batteryCapacity + "mAh");
    }
}