package P6.Library_System;

class Library {
	private int bookId;
	private int copies;

	public void setBookId(int bookId) {
		if (bookId > 0)
			this.bookId = bookId;
		else
			System.out.println("Invalid Book ID");
	}

	public void setCopies(int copies) {
		if (copies >= 0)
			this.copies = copies;
		else
			System.out.println("Invalid Copies");
	}

	public int getBookId() {
		return bookId;
	}

	public int getCopies() {
		return copies;
	}
}

