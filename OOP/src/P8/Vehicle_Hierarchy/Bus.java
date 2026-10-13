package P8.Vehicle_Hierarchy;
class Bus extends Vehicle {
	Bus(String brand, String model, int speed) {
		super(brand, model, speed);
	}

	@Override
	void start() {
		System.out.println("Bus is starting with an automatic start...");
	}

	@Override
	void displayInfo() {
		super.displayInfo();
	}
}