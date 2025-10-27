package libraryapp_after;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Pemrograman Lanjut");
        b1.setAuthor("Wildan Suharso");
        b1.setStock(5);
        b1.setPrice(100000);

        Library lib = new Library();
        lib.setBook(b1);
        lib.setLocation("UMM Library");

        lib.displayLibrary();
    }
}

