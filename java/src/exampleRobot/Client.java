package src.exampleRobot;

import src.exampleRobot.moving.FlyingStrategy;
import src.exampleRobot.attack.MissileStrategy;
import src.exampleRobot.attack.PunchStrategy;
import src.exampleRobot.moving.WalkingStrategy;
import src.exampleRobot.robot.Atom;
import src.exampleRobot.robot.Robot;
import src.exampleRobot.robot.TaekwonV;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("태권V");
        Robot atom = new Atom("아톰");

        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("너의 이름은? " + taekwonV.getName());
        taekwonV.attack();
        taekwonV.move();

        System.out.println("너의 이름은? " + atom.getName());
        atom.attack();
        atom.move();
    }
}
