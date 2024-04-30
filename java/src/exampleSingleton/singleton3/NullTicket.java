package src.exampleSingleton.singleton3;

import java.util.UUID;

public class NullTicket implements Ticket {
    public UUID getTicketNumber() {
        return UUID.fromString("0-0-0-0-0");
    }
}
