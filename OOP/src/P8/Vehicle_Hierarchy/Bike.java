package P8.Vehicle_Hierarchy;

class Bike extends Vehicle {
	Bike(String brand, String model, int speed) {
		super(brand, model, speed);
	}

	@Override
	void start() {
		System.out.println("Bike is starting with a kick start...");
	}

	@Override
	void displayInfo() {
		super.displayInfo();
	}
}