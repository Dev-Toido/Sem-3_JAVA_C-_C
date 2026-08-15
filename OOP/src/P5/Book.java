package P5;

public class Book {
//    Fields: title, author, ISBN, price. Create 2 objects.
    String title,author;
    long ISBN;
    int price;
    Book(String title,String author,long ISBN,int price){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.price=price;
    }
    Book(){
        title="";
        author="";
        ISBN=0;
        price=0;
    }


}
