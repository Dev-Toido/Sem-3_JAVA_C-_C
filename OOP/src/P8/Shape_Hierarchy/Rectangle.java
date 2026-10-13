package P8.Shape_Hierarchy;

class Rectangle extends Shape {
	double length;
	double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double area() {
		return length * breadth;
	}

	void displayDetails() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.printf("Area: %.2f sq. units%n", area());
	}
}
