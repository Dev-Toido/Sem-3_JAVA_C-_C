package P7.PartA.Library_Book;
public class Main {
	public static void main(String[] args) {
		Book b = new Book("Java Programming", "James Gosling");
		Library l = new Library("Central Library", b);

		l.display();
	}
}