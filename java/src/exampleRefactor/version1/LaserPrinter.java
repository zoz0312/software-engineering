package src.exampleRefactor.version1;

public class LaserPrinter {
    private double tonerCapacity;
    private double tonerReductionRate;


    private String ID;

    public LaserPrinter(String ID) {
        this.ID = ID;
        this.tonerCapacity = 100;
        this.tonerReductionRate = 0.5;
    }

    public String getID() {
        return ID;
    }

    private void print(Object msg) {
        if (isPrintable()) {
            System.out.println("토너 START");
            System.out.println(msg.toString());
            System.out.println("토너 END");
            tonerCapacity =- tonerReductionRate;
        } else {
            alert();
        }
    }

    public void alert () {
        System.out.println("토너부족");
    }

    public boolean isPrintable() {
        return 0 <= (tonerCapacity - tonerReductionRate);
    }

    public void testPrinting() {
        print("Print Testing");
    }
}
