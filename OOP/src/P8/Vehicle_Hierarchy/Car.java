package P8.Vehicle_Hierarchy;
class Car extends Vehicle {
	Car(String brand, String model, int speed) {
		super(brand, model, speed);
	}

	@Override
	void start() {
		System.out.println("Car is starting with a key ignition...");
	}

	@Override
	void displayInfo() {
		super.displayInfo();
	}
}

