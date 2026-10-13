package P7.PartB.Car_and_Engine_System;

class Car {
	String carNumber;
	String brand;
	String model;
	Engine engine;

	Car(String carNumber, String brand, String model, String engineNumber, String engineType, int horsePower) {
		this.carNumber = carNumber;
		this.brand = brand;
		this.model = model;
		this.engine = new Engine(engineNumber, engineType, horsePower);
	}

	void startCar() {
		System.out.println("Car started.");
		engine.startEngine();
	}

	void stopCar() {
		engine.stopEngine();
		System.out.println("Car stopped.");
	}

	void displayCarDetails() {
		System.out.println("Car Number: " + carNumber);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}

	void displayEngineDetails() {
		engine.displayEngineDetails();
	}
}
