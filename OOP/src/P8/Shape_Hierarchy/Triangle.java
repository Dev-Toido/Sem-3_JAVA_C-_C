package P8.Shape_Hierarchy;

class Triangle extends Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double area() {
		return 0.5 * base * height;
	}

	void displayDetails() {
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.printf("Area: %.2f sq. units%n", area());
	}
}
