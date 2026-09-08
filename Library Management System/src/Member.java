import java.util.Scanner;

public class Member {
	private int memberId;
	private String name;
	private int booksIssued;
	private Book[] issuedBook = new Book[3];
	private final java.util.Scanner sc = new Scanner(System.in);
	Member(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
		this.booksIssued = 0;
	}

	boolean canIssue() {
		return booksIssued < 3;
	}
	String getName() {return name;}
	void issueBook(Book book) {
		if (book == null) {
			System.out.println("Invalid book.");
			return;
		}
		if (!canIssue()) {
			System.out.println("You can't issue this book, as your book count is already 3!");
			return;
		}
		if (!book.isAvailable()) {
			System.out.println("You can't issue this book, as the book is not available!");
			return;
		}
		book.setAvail(false);
		booksIssued++;
		issuedBook[booksIssued - 1] = book;
		normalizeBList();

		System.out.println("Book " + book.getTitle() + " issued successfully!");
		System.out.println("Book issued till now: " + booksIssued);
	}

	void returnBook(Book book) {
		if (booksIssued == 0) {
			System.out.println("You can't return book, as you have not taken any book!");
			return;
		}
		boolean returned = false;
		for (int j = 0; j < booksIssued; j++) {
			if (issuedBook[j] != null && issuedBook[j].isEqualsBook(book)) {
				issuedBook[j].setAvail(true);
				issuedBook[j] = null;
				booksIssued--;
				normalizeBList();
				System.out.println("Book " + book.getTitle() + " returned successfully!");
				returned = true;
				break;
			}
		}
		if (!returned) {
			System.out.println("This member has not issued that book.");
		}
	}

	void updateMemberName(){
		System.out.print("Enter the updated name: ");
		this.name = sc.next();
		System.out.println("Update successfully!!");
	}
	void normalizeBList() {
		int write = 0;
		for (int read = 0; read < issuedBook.length; read++) {
			if (issuedBook[read] != null) {
				issuedBook[write++] = issuedBook[read];
			}
		}
		while (write < issuedBook.length) {
			issuedBook[write++] = null;
		}
	}

	void display() {
		normalizeBList();
		System.out.println("Member: " + memberId + ", Name: " + name + ", No. of Books Issued: " + booksIssued);
		if (booksIssued > 0) {
			System.out.printf("%-40s %-30s %-20s%n", "Title", "Author", "ISBN");
			System.out.println("-----------------------------------------------------------------------------------------");
			for (int i = 0; i < booksIssued; i++) {
				if (issuedBook[i] != null) {
					System.out.printf("%-40s %-30s %-20s%n",
							issuedBook[i].getTitle(),
							issuedBook[i].getAuthor(),
							issuedBook[i].getISBN()
					);
				}
			}
		}
	}
	boolean isEqualMember(Member member) {
		return member != null && this.memberId == member.memberId;
	}

	void deleteMember(){
		this.name = "";
		this.booksIssued = 0;
		issuedBook = new Book[3];
	}

	void releaseIssuedBooks() {
		for (int i = 0; i < issuedBook.length; i++) {
			if (issuedBook[i] != null) {
				issuedBook[i].setAvail(true);
				issuedBook[i] = null;
			}
		}
		booksIssued = 0;
	}
}
