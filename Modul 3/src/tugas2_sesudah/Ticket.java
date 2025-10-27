package tugas2_sesudah;

public abstract class Ticket {
    protected String passengerName;
    protected String startLocation;
    protected String destination;
    protected double price;

    public abstract void displayInfo();
}
