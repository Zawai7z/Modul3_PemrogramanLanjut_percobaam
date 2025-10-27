package tugas2_sesudah;

/**
 * Kelas TaxiTicket bertugas menampilkan berbagai informasi tiket taksi
 * berdasarkan data yang disediakan oleh {@link TicketInfo}.
 *
 * <p>Kelas ini juga memuat fitur sederhana seperti estimasi waktu tempuh,
 * status taksi, dan perhitungan harga akhir setelah pajak.</p>
 *
 * @author Marza
 * @version 1.0
 */
public class TaxiTicket {
    private TicketInfo info;

    /**
     * Konstruktor untuk membuat tiket taksi baru.
     *
     * @param info objek {@link TicketInfo} yang berisi data tiket
     */
    public TaxiTicket(TicketInfo info) {
        this.info = info;
    }

    /** Menampilkan status taksi saat ini. */
    public void checkStatus() {
        System.out.println("Taxi is on the way!");
    }

    /** Menampilkan estimasi durasi perjalanan. */
    public void displayEstimatedDuration() {
        System.out.println("Estimated duration: 15 minutes");
    }

    /** Menampilkan rute perjalanan berdasarkan data tiket. */
    public void displayRoute() {
        System.out.println("Route: " + info.getStartLocation() + " to " + info.getDestination());
    }

    /** Menampilkan informasi lengkap tentang tiket. */
    public void displayInfo() {
        double finalPrice = info.getPrice() + (info.getPrice() * 0.1);
        System.out.println("Passenger: " + info.getPassengerName());
        System.out.println("From: " + info.getStartLocation());
        System.out.println("To: " + info.getDestination());
        System.out.println("Price (after tax): Rp" + finalPrice);
    }
}
