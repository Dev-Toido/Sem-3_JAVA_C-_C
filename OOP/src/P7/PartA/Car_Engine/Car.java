package P7.PartA.Car_Engine;


class Car {
	String brand;
	String model;
	double price;
	Engine engine;

	Car(String brand, String model, double price, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}

	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Engine Number: " + engine.engineNumber);
		System.out.println("Engine Type: " + engine.engineType);
		System.out.println("Horsepower: " + engine.horsepower);
	}
}


