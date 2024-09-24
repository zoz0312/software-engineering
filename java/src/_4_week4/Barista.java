package src._4_week4;

public class Barista {
    private EspressoMachine espressoMachine;

    public Barista() {
        super();
    }
    public void setEspressoMachine (EspressoMachine espressoMachine) {
        this.espressoMachine = espressoMachine;
    }
    public Espresso makeEspresso() {
        CoffeeBeans coffeeBeans = new CoffeeBeans();
        Espresso espresso = this.espressoMachine.makeEspresso(coffeeBeans);
        return espresso;
    }

    public CafeLatte makeCafeLatte() {
        CoffeeBeans coffeeBeans = new CoffeeBeans();
        Espresso espresso = this.espressoMachine.makeEspresso(coffeeBeans);
        Milk milk = new Milk();
        CafeLatte cafeLatte = new CafeLatte();
        cafeLatte.setEspresso(espresso);
        cafeLatte.setMilk(milk);
        return cafeLatte;
    }

    @Override
    public String toString() {
        return "Barista";
    }
}
