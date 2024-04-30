package src.exampleSingleton.singleton3;

import src.exampleSingleton.singleton.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SingletonMain {
    private static final int THREAD_NUM = 15;
    public static <List> void main(String[] args) {
        TicketManager ticketManager = TicketManager.getTicketManager();
        ticketManager.setTicketLimit(5);

        UserThread[] users = new UserThread[THREAD_NUM];

        for (int i = 0; i < THREAD_NUM; i++) {
            users[i] = new UserThread("User" + i + " => ");
            users[i].start();
        }

        for (int i = 0; i < THREAD_NUM; i++) {
            try {
                users[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < THREAD_NUM; i++) {
            System.out.println("USER " + i + " get Ticket Number [" + users[i].getMyTicket().getTicketNumber() + "]");
        }

        System.out.println("START");

        java.util.List<UUID> reservedTicket = ticketManager.getAllTickets();
        for (UUID uuid : reservedTicket) {
            System.out.print("reservedTicket => " + uuid + " \n");
        }

    }
}
