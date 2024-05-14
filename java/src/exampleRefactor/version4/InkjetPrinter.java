package src.exampleRefactor.version4;

public class InkjetPrinter extends Printer {
    private PrintCartridge cartridge;

    public InkjetPrinter(String ID) {
        super(ID);
        cartridge = new PrintCartridge(100, 0.2);
    }

    @Override
    public void printing(Object msg) {
        System.out.println("잉크젯 START");
        System.out.println(msg.toString());
        System.out.println("잉크젯 END");
        cartridge.setCapacity(cartridge.getCapacity() - cartridge.getReductionRate());
    }

    public void alert () {
        System.out.println("잉크부족");
    }

    public boolean isPrintable() {
        return 0 <= (cartridge.getCapacity() - cartridge.getReductionRate());
    }

}
