package tugas2_sesudah;

/**
 * Kelas MainApp berfungsi sebagai titik masuk utama program.
 * Kelas ini membuat objek {@link TicketInfo} dan {@link TaxiTicket}
 * kemudian menampilkan informasi tiket secara lengkap.
 *
 * @author Marza
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        TicketInfo info = new TicketInfo("Zaidaan", "Malang", "Surabaya", 300000);
        TaxiTicket ticket = new TaxiTicket(info);

        ticket.checkStatus();
        ticket.displayEstimatedDuration();
        ticket.displayRoute();
        ticket.displayInfo();
    }
}
