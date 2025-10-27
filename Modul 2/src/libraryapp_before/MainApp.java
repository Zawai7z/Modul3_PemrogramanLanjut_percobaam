package libraryapp_before;

public class MainApp {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Pemrograman Lanjut";
        b1.author = "Wildan Suharso";
        b1.stock = 5;
        b1.price = 100000;

        Library lib = new Library();
        lib.book = b1;
        lib.location = "UMM Library";

        lib.displayLibrary();
    }
}
