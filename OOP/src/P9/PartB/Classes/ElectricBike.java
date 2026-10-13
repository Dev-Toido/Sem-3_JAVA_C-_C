package P9.PartB.Classes;

import P9.PartB.Interfaces.*;


public class ElectricBike extends Vehicle implements Chargeable, GPS {

	public ElectricBike(String id, String brand, int speed) {
		super(id, brand, speed);
	}

	@Override
	public void start() {
		System.out.println("Electric bike starts silently.");
	}

	@Override
	public void charge() {
		System.out.println("Electric bike is charging.");
	}

	@Override
	public void showLocation() {
		System.out.println("Electric bike location: Gandhinagar");
	}
}
