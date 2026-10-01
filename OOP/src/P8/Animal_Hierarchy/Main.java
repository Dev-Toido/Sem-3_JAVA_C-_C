package P8.Animal_Hierarchy;

public class Main {
	public static void main(String[] args) {
		Animal obj;
		obj= new Dog("Tommy",10);
		obj.displayDetails();
		obj.sound();
		obj = new Cat("Puchu",3);
		obj.displayDetails();
		obj.sound();
		obj = new Cow("Sumita",15);
		obj.displayDetails();
		obj.sound();
	}
}