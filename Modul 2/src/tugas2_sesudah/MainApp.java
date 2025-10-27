package tugas2_sesudah;

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
