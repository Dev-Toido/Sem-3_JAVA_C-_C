package P6.Library_System;

public class Member {
	private int memberID;
	private String memberName;
	private Book book;
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	void issueBook(int memberID,Book book) {
		if(this.memberID == memberID) {
			if(this.book!=null) {
				if(book.isAvailable()) {
					this.book=book;
					book.bookIssued();
					System.out.println("Book Issued");
				}
				else {
					System.out.println("Book Not Available!");
				}
			}
			else {
				System.out.println("Book Already Issued!");
			}
		}
		else {
			System.out.println("Unauthorized access");
		}
	}

	


}
