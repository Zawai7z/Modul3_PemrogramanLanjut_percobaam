package libraryapp_before;

public class Library {
    public Book book;
    public String location;

    public void displayLibrary() {
        System.out.println("Library Location: " + location);
        book.displayInfo();
    }
}
