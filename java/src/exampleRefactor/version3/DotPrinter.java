package src.exampleRefactor.version3;

public class DotPrinter extends Printer {
    public DotPrinter(String ID) {
        super(ID);
    }

    @Override
    public void printing(Object msg) {
        System.out.println("도트 START");
        System.out.println(msg.toString());
        System.out.println("도트 END");
    }

    public boolean isPrintable() {
        return true;
    }

    @Override
    public void alert() {

    }
}
