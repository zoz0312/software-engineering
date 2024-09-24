package src._4_week4;

public class EspressoMachine {
    private int price = 300000;

    private Espresso espresso;
    private Milk milk;

    public EspressoMachine() {
        super();
    }

    public Espresso makeEspresso(CoffeeBeans coffeeBeans) {
        System.out.println("CoffeBeans => ["+ coffeeBeans +"]");
        return new Espresso();
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "EspressoMachine";
    }
}
