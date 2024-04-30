package src.exampleSingleton.singleton3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TicketManager {
    private static TicketManager ticketManager;
    private static int currentIndex;
    private static int maxIndex;
    private static final List<UUID> reservedTicket = new ArrayList<>(100);

    public TicketManager () {
        currentIndex = 0;
        maxIndex = 100;
    }
    public synchronized static TicketManager getTicketManager() {
        if (ticketManager == null) {
            ticketManager = new TicketManager();
        }
        return ticketManager;
    }

    public synchronized void setTicketLimit(int limit) {
        this.maxIndex = limit;
    }

    public synchronized Ticket getTicket() {
        if (currentIndex < maxIndex) {
            currentIndex++;
            UUID createdUUID = UUID.randomUUID();
            reservedTicket.add(createdUUID);
            return new NormalTicket(createdUUID);
        }
        System.out.println("Ticket limit reached");
        return new NullTicket();
    }

    public synchronized List<UUID> getAllTickets() {
        return reservedTicket;
    }
}
