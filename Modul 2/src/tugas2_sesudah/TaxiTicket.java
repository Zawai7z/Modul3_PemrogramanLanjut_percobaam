package tugas2_sesudah;

public class TaxiTicket extends Ticket implements Operational {
    private static final double TAX_RATE = 0.1;

    public TaxiTicket(TicketInfo info) {
        this.passengerName = info.passengerName();
        this.startLocation = info.startLocation();
        this.destination = info.destination();
        this.price = info.price();
    }

    public double calculateFinalPrice() {
        return price + (price * TAX_RATE);
    }

    @Override
    public void checkStatus() {
        System.out.println("Taxi is on the way!");
    }

    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated duration: 15 minutes");
    }

    @Override
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " to " + destination);
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + startLocation);
        System.out.println("To: " + destination);
        System.out.println("Price (after tax): " + calculateFinalPrice());
    }
}
