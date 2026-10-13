package P7.PartA.Mobile_Battery;
class Mobile {
	String brand;
	String model;
	Battery battery;

	Mobile(String brand, String model, Battery battery) {
		this.brand = brand;
		this.model = model;
		this.battery = battery;
	}

	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Battery Capacity: " + battery.capacity + " mAh");
	}
}