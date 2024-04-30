package src.exampleSingleton.singleton;

public class UserThread extends Thread{
    private String name;

    public UserThread(String name) {
        super();
        this.name = name;
    }

    public void run () {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using" + printer.toString() + ".");
    }
}
