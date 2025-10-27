package libraryapp_after;

public class Library {
    private Book book;
    private String location;

    // Encapsulate Field
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public void displayLibrary() {
        System.out.println("Library Location: " + location);
        book.displayInfo();
    }
}
