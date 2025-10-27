package tugas2_sebelum;

public class TaxiTicket {
    public String pName;
    public String sLocation;
    public String desc;
    public double price;

    public void cS() {
        System.out.println("Taxi is on the way!");
    }

    public void dED() {
        System.out.println("Estimated duration: 15 minutes");
    }

    public void dR() {
        System.out.println("Route: " + sLocation + " to " + desc);
    }

    public void dI() {
        double finalPrice = price + (price * 0.1);
        System.out.println("Passenger: " + pName);
        System.out.println("From: " + sLocation);
        System.out.println("To: " + desc);
        System.out.println("Price (after tax): " + finalPrice);
    }

    public static void main(String[] args) {
        TaxiTicket t1 = new TaxiTicket();
        t1.pName = "Zaidan";
        t1.sLocation = "Malang";
        t1.desc = "Surabaya";
        t1.price = 300000;

        t1.cS();
        t1.dED();
        t1.dR();
        t1.dI();
    }
}
