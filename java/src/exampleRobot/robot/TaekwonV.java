package src.exampleRobot.robot;

public class TaekwonV extends Robot {
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("태원브이 공격");
    }

    @Override
    public void move() {
        System.out.println("태원브이 움직여");
    }
}
