package src.exampleSingleton.singleton3;

public class UserThread extends Thread{
    private Ticket myTicket;

    public UserThread(String name) {
        super(name);
    }

    public void run () {
        TicketManager ticketManager = TicketManager.getTicketManager();
        myTicket = ticketManager.getTicket();
    }

    public Ticket getMyTicket() {
        return myTicket;
    }
}
