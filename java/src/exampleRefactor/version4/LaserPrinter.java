package src.exampleRefactor.version4;

public class LaserPrinter extends Printer {
    private PrintCartridge cartridge;;

    public LaserPrinter(String ID) {
        super(ID);
        cartridge = new PrintCartridge(100, 0.5);
    }

    @Override
    public void printing(Object msg) {
        System.out.println("토너 START");
        System.out.println(msg.toString());
        System.out.println("토너 END");
        cartridge.setCapacity(cartridge.getCapacity() - cartridge.getReductionRate());
    }

    public void alert () {
        System.out.println("토너부족");
    }

    public boolean isPrintable() {
        return 0 <= (cartridge.getCapacity() - cartridge.getReductionRate());
    }
}
