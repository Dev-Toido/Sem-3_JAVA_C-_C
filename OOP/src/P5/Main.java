public class Main {
    public static void main(String[] args) {
        // Creating 2 objects
        System.out.println("\nThe objects of the Book are: ");
        Book book1 = new Book("1984", "George Orwell", "123456789", 1000.5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "123456788", 8500.64);

        book1.display();
        book2.display();


        // Creating 2 objects of Laptop
        System.out.println("\nThe objects of the Laptop are: ");
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 16, 512);
        Laptop laptop2 = new Laptop("Apple", "MacBook Air", 8, 256);

        laptop1.display();
        laptop2.display();


        // Creating 2 objects of Mobile
        System.out.println("\nThe objects of the Mobile are: ");
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S23", 79999.99, 3900);
        Mobile mobile2 = new Mobile("Apple", "iPhone 15", 89999.99, 3349);

        mobile1.display();
        mobile2.display();

        // Creating 1 object of BankAccount
        System.out.println("\nThe objects of the BankAccount are: ");
        BankAccount acc = new BankAccount("ACC1001", "Alex Johnson", 1000.0);

        acc.display();
        acc.deposit(250.0);
        acc.withdraw(100.0);
        acc.display();


        // Creating 3 objects of Product
        System.out.println("\nThe objects of the Product are: ");
        Product p1 = new Product(101, "Wireless Mouse", "Electronics", 45);
        Product p2 = new Product(102, "Mechanical Keyboard", "Electronics", 20);
        Product p3 = new Product(103, "Ergonomic Chair", "Furniture", 12);

        p1.display();
        p2.display();
        p3.display();

    }
}
