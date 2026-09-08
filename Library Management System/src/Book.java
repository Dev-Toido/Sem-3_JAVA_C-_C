import java.util.Objects;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;
	private final Scanner sc = new Scanner(System.in);
	// Constructor
	Book() {
		this.title = "";
		this.author = "";
		this.ISBN = "";
		this.isAvailable = false;
	}

	Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;
	}

	//getter setter methods
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String getISBN() {
		return this.ISBN;
	}
	boolean isAvailable() {
		return this.isAvailable;
	}
	void setAvail(boolean b) {
		this.isAvailable = b;
	}
	// Other method
	void makeEmpty() {
		ISBN = "";
		author = "";
		title = "";
		isAvailable = false;
	}
	boolean isEqualsBook(Book b) {
		return b != null
				&& Objects.equals(this.ISBN, b.ISBN)
				&& Objects.equals(this.author, b.author)
				&& Objects.equals(this.title, b.title);
	}
	void updateDetails() {
		int ch;
		do{
			System.out.print("Choose modification (1-title, 2-author, 3-ISBN, 0-done): ");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch){
				case 1:
					System.out.print("Enter title: ");
					this.title = sc.nextLine();
					break;
				case 2:
					System.out.print("Enter author: ");
					this.author = sc.nextLine();
					break;
				case 3:
					System.out.print("Enter ISBN: ");
					this.ISBN = sc.nextLine();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid choice.");
			}
		}while(ch!=0);
	}
	void display() {
		System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + (isAvailable ? "Yes" : "No"));
	}
}