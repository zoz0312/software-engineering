package src.exampleRefactor.version1;

public class DotPrinter {
    private String ID;

    public DotPrinter(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    private void print(Object msg) {
//        if (isPrintable()) {
            System.out.println("도트 START");
            System.out.println(msg.toString());
            System.out.println("도트 END");
//            tonerCapacity =- tonerReductionRate;
//        } else {
//            alert();
//        }
    }

//    public void alert () {
//        System.out.println("토너부족");
//    }

    public boolean isPrintable() {
        return true;
    }

    public void testPrinting() {
        print("Print Testing");
    }
}
