package src.exampleSingleton.singleton2;

public class Printer {
    private static Printer printer = null;
    private int counter = 0;

    private Printer () {}

    public synchronized static Printer getPrinter() {
        if (printer == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {}

            printer = new Printer();
        }
        return printer;
    }

    public void print(String message) {
        synchronized (this) {
            counter++;
            System.out.println(message + " : " + counter);
        }
    }
}
