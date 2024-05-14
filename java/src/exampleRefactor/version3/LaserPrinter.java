package src.exampleRefactor.version3;

public class LaserPrinter extends Printer {
    private double tonerCapacity;
    private double tonerReductionRate;

    public LaserPrinter(String ID) {
        super(ID);
        this.tonerCapacity = 100;
        this.tonerReductionRate = 0.5;
    }

    @Override
    public void printing(Object msg) {
        System.out.println("토너 START");
        System.out.println(msg.toString());
        System.out.println("토너 END");
        tonerCapacity =- tonerReductionRate;
    }

    public void alert () {
        System.out.println("토너부족");
    }

    public boolean isPrintable() {
        return 0 <= (tonerCapacity - tonerReductionRate);
    }
}
