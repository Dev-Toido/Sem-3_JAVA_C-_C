class Book {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable= false;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}