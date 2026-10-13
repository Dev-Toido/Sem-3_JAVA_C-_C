package P9.PartB.Classes;

import P9.PartB.Interfaces.*;

public class ElectricCar extends Vehicle implements Chargeable, GPS {
	public ElectricCar(String id, String brand, int speed) {
		super(id, brand, speed);
	}

	@Override
	public void start() {
		System.out.println("Electric car starts silently.");
	}

	@Override
	public void charge() {
		System.out.println("Electric car is charging.");
	}

	@Override
	public void showLocation() {
		System.out.println("Location: Ahmedabad");
	}
}