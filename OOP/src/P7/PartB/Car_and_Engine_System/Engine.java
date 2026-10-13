package P7.PartB.Car_and_Engine_System;

class Engine {
	String engineNumber;
	String engineType;
	int horsePower;

	Engine(String engineNumber, String engineType, int horsePower) {
		this.engineNumber = engineNumber;
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	void startEngine() {
		System.out.println("Engine started.");
	}

	void stopEngine() {
		System.out.println("Engine stopped.");
	}

	void displayEngineDetails() {
		System.out.println("Engine Number: " + engineNumber);
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsePower);
	}
}