package src.exampleRobot.moving;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("날 수 있어");
    }
}
