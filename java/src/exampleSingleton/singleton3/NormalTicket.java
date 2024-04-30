package src.exampleSingleton.singleton3;

import java.util.UUID;

public class NormalTicket implements Ticket{
    private UUID serialNumber;

    public NormalTicket(UUID serialNumber) {
        this.serialNumber = serialNumber;
    }

    public UUID getTicketNumber () {
        return serialNumber;
    }
}
