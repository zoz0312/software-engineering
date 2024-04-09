package src.exampleRobot.attack;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("주먹 공격");
    }
}
