package tugas2_sesudah;

/**
 * Kelas TicketInfo menyimpan informasi dasar mengenai tiket taksi
 * seperti nama penumpang, lokasi asal, tujuan, dan harga tiket.
 *
 * <p>Kelas ini berperan sebagai model data yang digunakan oleh kelas
 * {@link TaxiTicket} untuk menampilkan informasi lengkap kepada pengguna.</p>
 *
 * @author Marza
 * @version 1.0
 */
public class TicketInfo {
    private String passengerName;
    private String startLocation;
    private String destination;
    private double price;

    /**
     * Konstruktor untuk membuat objek TicketInfo baru.
     *
     * @param passengerName nama penumpang
     * @param startLocation lokasi awal keberangkatan
     * @param destination tujuan perjalanan
     * @param price harga tiket
     */
    public TicketInfo(String passengerName, String startLocation, String destination, double price) {
        this.passengerName = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    /** @return nama penumpang */
    public String getPassengerName() { return passengerName; }

    /** @return lokasi awal keberangkatan */
    public String getStartLocation() { return startLocation; }

    /** @return tujuan perjalanan */
    public String getDestination() { return destination; }

    /** @return harga tiket */
    public double getPrice() { return price; }
}
