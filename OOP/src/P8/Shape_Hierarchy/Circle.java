package P8.Shape_Hierarchy;

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	void displayDetails() {
		System.out.println("Radius: " + radius);
		System.out.printf("Area: %.2f sq. units%n", area());
	}
}
