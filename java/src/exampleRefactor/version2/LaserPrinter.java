package src.exampleRefactor.version2;

public class LaserPrinter extends Printer {
    private double tonerCapacity;
    private double tonerReductionRate;

    public LaserPrinter(String ID) {
        super(ID);
        this.tonerCapacity = 100;
        this.tonerReductionRate = 0.5;
    }

    public void print(Object msg) {
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
}
