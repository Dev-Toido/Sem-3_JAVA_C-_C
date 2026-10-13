package P7.PartA.Library_Book;

class Library {
	String libraryName;
	Book book;

	Library(String libraryName, Book book) {
		this.libraryName = libraryName;
		this.book = book;
	}

	void display() {
		System.out.println("Library: " + libraryName);
		System.out.println("Book Title: " + book.title);
		System.out.println("Author: " + book.author);
	}
}