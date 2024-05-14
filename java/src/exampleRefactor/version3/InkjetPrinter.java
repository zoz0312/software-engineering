package src.exampleRefactor.version3;

public class InkjetPrinter extends Printer {
    private double inkCapacity;
    private double inkReductionRate;

    public InkjetPrinter(String ID) {
        super(ID);
        this.inkCapacity = 100;
        this.inkReductionRate = 0.5;
    }

    @Override
    public void printing(Object msg) {
        System.out.println("잉크젯 START");
        System.out.println(msg.toString());
        System.out.println("잉크젯 END");
        inkCapacity =- inkReductionRate;
    }

    public void alert () {
        System.out.println("잉크부족");
    }

    public boolean isPrintable() {
        return 0 <= (inkCapacity - inkReductionRate);
    }

}
