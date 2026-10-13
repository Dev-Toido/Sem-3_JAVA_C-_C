package P8.Shape_Hierarchy;
public class Main {
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(4, 6);
		Shape s3 = new Triangle(10, 5);

		System.out.println("Circle");
		System.out.println("Radius: 5.0");
		System.out.printf("Area: %.2f sq. units%n", s1.area());

		System.out.println();

		System.out.println("Rectangle");
		System.out.println("Length: 4.0, Breadth: 6.0");
		System.out.printf("Area: %.2f sq. units%n", s2.area());

		System.out.println();

		System.out.println("Triangle");
		System.out.println("Base: 10.0, Height: 5.0");
		System.out.printf("Area: %.2f sq. units%n", s3.area());
	}
}
