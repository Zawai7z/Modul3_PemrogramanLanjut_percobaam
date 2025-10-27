package libraryapp_before;

public class Book {
    public String title;
    public String author;
    public int stock;
    public double price;

    public void displayInfo() {
        double discount = 0.1;
        double discountPrice = price - (price * discount);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price after discount: " + discountPrice);
        System.out.println("Stock: " + stock);
    }
}
