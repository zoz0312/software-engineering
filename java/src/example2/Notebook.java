package src.example2;

public class Notebook extends Computer {
    private int battery;

    public Notebook(String name, int initCharge) {
        super(name);
        battery = initCharge;
    }

    public void charge() {
        battery += 5;
    }

    public void useBattery() {
        battery -= 1;
    }

    public void movingcal() {
        if (getBatteryinfo() < 1) {
            System.out.println("충전이필요합니다.");
            return;
        }

        System.out.println("이동하면서");
        calculate();
        useBattery();
    }

    public int getBatteryinfo() {
        return battery;
    }
}
