package P8.Vehicle_Hierarchy;
class Vehicle {
	String brand;
	String model;
	int speed;

	Vehicle(String brand, String model, int speed) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	void start() {
		System.out.println("Vehicle is starting...");
	}

	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Speed: " + speed + " km/h");
	}
}
