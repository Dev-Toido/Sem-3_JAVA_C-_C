package P6.Employee_System;

public class Main {
	static void main() {
		Employee e1 = new Employee(1,"Jayesh",35,80000);
		Employee e2 = new Employee(2,"Mayesh",40,100000);

		e1.display(1);
		e2.display(2);
		e1.display(3);
	}
}
