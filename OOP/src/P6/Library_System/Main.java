package P6.Library_System;

public class Main {
	public static void main(String[] args) {
		Library l = new Library();

		l.setBookId(101);
		l.setCopies(5);

		System.out.println("Book ID: " + l.getBookId());
		System.out.println("Copies: " + l.getCopies());
	}
}