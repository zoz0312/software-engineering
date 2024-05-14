package src.exampleRefactor.version1;

public class InkjetPrinter {
    private double inkCapacity;
    private double inkReductionRate;


    private String ID;

    public InkjetPrinter(String ID) {
        this.ID = ID;
        this.inkCapacity = 100;
        this.inkReductionRate = 0.5;
    }

    public String getID() {
        return ID;
    }

    private void print(Object msg) {
        if (isPrintable()) {
            System.out.println("잉크젯 START");
            System.out.println(msg.toString());
            System.out.println("잉크젯 END");
            inkCapacity =- inkReductionRate;
        } else {
            alert();
        }
    }

    public void alert () {
        System.out.println("잉크부족");
    }

    public boolean isPrintable() {
        return 0 <= (inkCapacity - inkReductionRate);
    }

    public void testPrinting() {
        print("Print Testing");
    }

}
