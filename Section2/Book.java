
public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println(title + " by " + author);
    }
    public static void main(String[] args) {
        Book b = new Book("Shivaji Maharaj", "Ranjeet Desai");
        b.displayInfo();
    }
}

