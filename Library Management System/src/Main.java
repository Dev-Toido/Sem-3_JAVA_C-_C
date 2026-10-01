import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Library library = new Library();
		int mchoice,schoice;

		do {
			printMainMenu();
			mchoice = readInt("Enter your choice: ");
			if (mchoice > 3 || mchoice < 0) {
				System.out.println("Invalid choice.");
				continue;
			}
			if (mchoice == 0) {
				System.out.println("Exiting from LIBRARY MANAGEMENT SYSTEM, Thanks for using!!");
				break;}
			do {
				printMainSubMenu(mchoice);

				schoice = readInt("Enter your choice: ");
				if (schoice == 0) {
					System.out.println("Getting back to P8.Animal_Hierarchy.Main Menu!!");
					break;
				}
				switch (mchoice) {
					case 1:
						switch (schoice) {
							case 1:
								addBook(library);
								break;
							case 2:
								library.viewBooks();
								break;
							case 3:
								library.viewAvailBooks();
								break;
							case 4:
								library.viewNotAvailBooks();
								break;
							case 5:
								library.searchBookByISBN(readText("Enter ISBN: "));
								break;
							case 6:
								library.searchBookByTitle(readText("Enter title: "));
								break;
							case 7:
								library.displayBooksByIndex(readInt("Enter book index (0-based): "));
								break;
							case 8:
								library.updateBook(bookFromISBN());
								break;
							case 9:
								library.deleteBook(bookFromISBN());
								break;
							default:
								System.out.println("Wrong choice!");
						}
						break;
					case 2:
						switch (schoice) {
							case 1:
								addMember(library);
								break;
							case 2:
								library.viewAllMembers();
								break;
							case 3:
								library.searchMemberByName(readText("Enter member name: "));
								break;
							case 4:
								library.updateMember(memberFromId());
								break;
							case 5:
								library.deleteMember(memberFromId());
								break;
							default:
								System.out.println("Wrong choice!");
						}
						break;
					case 3:
						switch (schoice) {
							case 1:
								library.issueBookByMember(bookFromISBN(), memberFromId());
								break;
							case 2:
								library.returnBookByMember(bookFromISBN(), memberFromId());
								break;
							default:
								System.out.println("Wrong choice!");
						}
						break;
					default:
						System.out.println("Invalid choice.");
				}
			}while(schoice != 0);
		}while(mchoice != 0);
	}

	private static void printMainMenu() {
		System.out.printf("%n========== \t%s\t ==========","LIBRARY MANAGEMENT SYSTEM");
		System.out.printf("%n========== \t\t\t%s\t\t\t ==========\n","P8.Animal_Hierarchy.Main Menu");
		System.out.println("===============================================");
		System.out.println("1. Books management");
		System.out.println("2. Members management");
		System.out.println("3. Issue and return management");
		System.out.println("0. Exit");
		System.out.println("===============================================");
	}
	private static void printMainSubMenu(int choice) {
		System.out.printf("%n========== \t%s\t ==========","LIBRARY MANAGEMENT SYSTEM");
		System.out.printf("%n========== \t\t%s\t\t\t ==========\n","P8.Animal_Hierarchy.Main Sub-Menu");
		System.out.println("===============================================");
		switch (choice) {
			case 1:
				System.out.println("1.  Add book");
				System.out.println("2.  View all books");
				System.out.println("3.  View available books");
				System.out.println("4.  View issued books");
				System.out.println("5.  Search book by ISBN");
				System.out.println("6.  Search book by title");
				System.out.println("7.  Display book by index");
				System.out.println("8.  Update book");
				System.out.println("9.  Delete book");
				break;
			case 2:
				System.out.println("1. Add member");
				System.out.println("2. View all members");
				System.out.println("3. Search member by name");
				System.out.println("4. Update member");
				System.out.println("5. Delete member");
				break;
			case 3:
				System.out.println("1. Issue book");
		        System.out.println("2. Return book");
				break;
			default:
				System.out.println("Invalid choice.");
		}
		System.out.println("0.  To get back to the main menu");
		System.out.println("===============================================");
	}



	private static void addBook(Library library) {
		String title = readText("Enter title: ");
		String author = readText("Enter author: ");
		String isbn = readText("Enter ISBN: ");
		Book book = new Book(title, author, isbn);

		if (library.isBookExist(book)) {
			System.out.println("A book with this title or ISBN already exists.");
			return;
		}
		library.addBook(book);
	}

	private static void addMember(Library library) {
		int id = readInt("Enter member ID: ");
		String name = readText("Enter member name: ");
		Member member = new Member(id, name);

		if (library.isMemberExist(member)) {
			System.out.println("A member with this ID already exists.");
			return;
		}
		library.addMember(member);
	}

	private static Book bookFromISBN() {
		return new Book("", "", readText("Enter ISBN: "));
	}

	private static Member memberFromId() {
		return new Member(readInt("Enter member ID: "), "");
	}

	private static String readText(String prompt) {
		System.out.print(prompt);
		return sc.nextLine().trim();
	}

	private static int readInt(String prompt) {
		while (true) {
			String value = readText(prompt);
			try {
				return Integer.parseInt(value);
			} catch (NumberFormatException exception) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
}
