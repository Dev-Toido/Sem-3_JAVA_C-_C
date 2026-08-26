public class Member {
    int memberId;
    String name;
    int booksIssued;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.booksIssued = 0;
    }

    void issueBook(Book book) {

    }

    void display() {
        System.out.println("Member: " + memberId + ", Name: " + name + ", No. of Books Issued: " + booksIssued);
    }
}
