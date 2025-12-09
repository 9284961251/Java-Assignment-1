package Section2;
public class EncapsulatedBook {
    private String title;
    private String author;

    public EncapsulatedBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static void main(String[] args) {
        EncapsulatedBook encapsulatedBook = new EncapsulatedBook("Shivam", "Arya");
        System.out.println(encapsulatedBook.getTitle());
        System.out.println(encapsulatedBook.author);
    }
}
