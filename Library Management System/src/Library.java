public class Library {
	private static final int MAX_BOOKS = 100;
	private static final int MAX_MEMBERS = 100;

	private final Book[] books = new Book[MAX_BOOKS];
	private final Member[] members = new Member[MAX_MEMBERS];
	private int noOfBooks = 0;
	private int noOfMembers = 0;

	// Availability checks
	boolean isBookSpaceAvail() {
		return noOfBooks < MAX_BOOKS;
	}

	boolean isMemberSpaceAvail() {
		return noOfMembers < MAX_MEMBERS;
	}

	// Book lookup functions
	boolean isBookExist(Book book) {
		return whereBookExist(book) != -1;
	}

	int whereBookExist(Book book) {
		if (book == null) {
			return -1;
		}
		for (int i = 0; i < noOfBooks; i++) {
			if (books[i].getTitle().equals(book.getTitle())
					|| books[i].getISBN().equals(book.getISBN())) {
				return i;
			}
		}
		return -1;
	}

	int noOfBooksPresent() {
		return noOfBooks;
	}

	int noOfBooksPresent(Book book) {
		if (book == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < noOfBooks; i++) {
			if (books[i].getTitle().equals(book.getTitle())
					|| books[i].getISBN().equals(book.getISBN())) {
				count++;
			}
		}
		return count;
	}

	// Create functions
	void addBook(Book book) {
		if (book == null) {
			System.out.println("Invalid book.");
		} else if (!isBookSpaceAvail()) {
			System.out.println("Book space is full!!");
		} else {
			books[noOfBooks++] = book;
			System.out.println("Book added successfully!!");
		}
	}

	// Read functions
	void viewBooks() {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
			return;
		}
		System.out.println("All books in this library are:");
		for (int i = 0; i < noOfBooks; i++) {
			books[i].display();
		}
	}

	void viewAvailBooks() {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
			return;
		}
		int count = 0;
		System.out.println("Available Books are:");
		for (int i = 0; i < noOfBooks; i++) {
			if (books[i].isAvailable()) {
				books[i].display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No available books.");
		}
	}

	void viewNotAvailBooks() {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
			return;
		}
		int count = 0;
		System.out.println("Not Available Books are:");
		for (int i = 0; i < noOfBooks; i++) {
			if (!books[i].isAvailable()) {
				books[i].display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("All books are available.");
		}
	}

	void searchBookByISBN(String ISBN) {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
			return;
		}
		int count = 0;
		for (int i = 0; i < noOfBooks; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				if (count == 0) {
					System.out.println("The books with " + ISBN + " are:");
				}
				books[i].display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no such books!!");
		}
	}

	void searchBookByTitle(String title) {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
			return;
		}
		int count = 0;
		for (int i = 0; i < noOfBooks; i++) {
			if (books[i].getTitle().equals(title)) {
				if (count == 0) {
					System.out.println("The books with " + title + " are:");
				}
				books[i].display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no such books!!");
		}
	}

	void displayBooksByIndex(int index) {
		if (noOfBooks == 0) {
			System.out.println("No book exist !!");
		} else if (index < 0 || index >= noOfBooks) {
			System.out.println("Invalid index!!");
		} else {
			books[index].display();
		}
	}

	// Update functions
	void updateBook(Book book) {
		int index = whereBookExist(book);
		if (index == -1) {
			System.out.println("No such book exist !!");
			return;
		}
		books[index].updateDetails();
		System.out.println("Book updated successfully!!");
	}

	// Delete functions
	void deleteBook(Book book) {
		int index = whereBookExist(book);
		if (index == -1) {
			System.out.println("No such book exist !!");
		} else if (!books[index].isAvailable()) {
			System.out.println("Book cannot be deleted while it is issued.");
		} else {
			books[index] = null;
			normalizeBooks();
			System.out.println("Book deleted successfully!!");
		}
	}

	// Member functions
	void addMember(Member member) {
		if (member == null) {
			System.out.println("Invalid member.");
		} else if (!isMemberSpaceAvail()) {
			System.out.println("Member space is full!!");
		} else {
			members[noOfMembers++] = member;
			System.out.println("Member added successfully!!");
		}
	}

	void viewAllMembers() {
		if (noOfMembers == 0) {
			System.out.println("No member exist !!");
			return;
		}
		System.out.println("All members in this library are:");
		for (int i = 0; i < noOfMembers; i++) {
			members[i].display();
		}
	}

	boolean isMemberExist(Member member) {
		return whereMemberExist(member) != -1;
	}

	int whereMemberExist(Member member) {
		if (member == null) {
			return -1;
		}
		for (int i = 0; i < noOfMembers; i++) {
			if (members[i].isEqualMember(member)) {
				return i;
			}
		}
		return -1;
	}

	void searchMemberByName(String name) {
		if (noOfMembers == 0) {
			System.out.println("No member exist !!");
			return;
		}
		int count = 0;
		for (int i = 0; i < noOfMembers; i++) {
			if (members[i].getName().equals(name)) {
				if (count == 0) {
					System.out.println("The members named " + name + " are:");
				}
				members[i].display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no such members!!");
		}
	}

	void issueBookByMember(Book book, Member member) {
		int bookIndex = whereBookExist(book);
		int memberIndex = whereMemberExist(member);
		if (bookIndex == -1 || memberIndex == -1) {
			System.out.println("Either book or member doesn't exist !!");
			return;
		}
		members[memberIndex].issueBook(books[bookIndex]);
	}

	void returnBookByMember(Book book, Member member) {
		int bookIndex = whereBookExist(book);
		int memberIndex = whereMemberExist(member);
		if (bookIndex == -1 || memberIndex == -1) {
			System.out.println("Either book or member doesn't exist !!");
			return;
		}
		members[memberIndex].returnBook(books[bookIndex]);
	}

	void updateMember(Member member) {
		int index = whereMemberExist(member);
		if (index == -1) {
			System.out.println("No member exist !!");
			return;
		}
		members[index].updateMemberName();
		System.out.println("Member updated successfully!!");
	}

	void deleteMember(Member member) {
		int index = whereMemberExist(member);
		if (index == -1) {
			System.out.println("No member exist !!");
			return;
		}
		members[index].releaseIssuedBooks();
		members[index].deleteMember();
		members[index] = null;
		normalizeMembers();
		System.out.println("Member deleted successfully!!");
	}

	void normalizeBooks() {
		int write = 0;
		for (int read = 0; read < books.length; read++) {
			if (books[read] != null) {
				books[write++] = books[read];
			}
		}
		for (int i = write; i < books.length; i++) {
			books[i] = null;
		}
		noOfBooks = write;
	}

	void normalizeMembers() {
		int write = 0;
		for (int read = 0; read < members.length; read++) {
			if (members[read] != null) {
				members[write++] = members[read];
			}
		}
		for (int i = write; i < members.length; i++) {
			members[i] = null;
		}
		noOfMembers = write;
	}
}
