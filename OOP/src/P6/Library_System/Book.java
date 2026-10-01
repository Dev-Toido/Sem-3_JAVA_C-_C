package P6.Library_System;

public class Book {
	private int id;
	private String title;
	private String author;
	private int copies;
	private int availableCopies;
	public Book(int id, String title, String author, int copies) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	public boolean isAvailable() {
		return copies>0;}
	void bookIssued(){
		availableCopies--;
	}
}
