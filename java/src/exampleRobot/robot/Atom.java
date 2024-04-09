package src.exampleRobot.robot;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("아톰 공격");
    }

    @Override
    public void move() {
        System.out.println("아톰 날아.");
    }
}
