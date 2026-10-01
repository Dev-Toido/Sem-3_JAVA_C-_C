class Book {
    String title;
    String author;
    String ISBN;
    double price;

    // Constructor
    Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Price: Rs" + price);
    }
}