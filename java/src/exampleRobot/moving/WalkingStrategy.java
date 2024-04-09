package src.exampleRobot.moving;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("걸을 수 있어");
    }
}
