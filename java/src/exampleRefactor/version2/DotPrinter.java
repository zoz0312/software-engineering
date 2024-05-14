package src.exampleRefactor.version2;

public class DotPrinter extends Printer {
    public DotPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
//        if (isPrintable()) {
            System.out.println("도트 START");
            System.out.println(msg.toString());
            System.out.println("도트 END");
//            tonerCapacity =- tonerReductionRate;
//        } else {
//            alert();
//        }
    }

    public boolean isPrintable() {
        return true;
    }
}
