package src;

//import src.exampleRobot.Client;

import src.exampleCommand.Client;

public class Main {
    public static void main(String[] args) {
//        Director d = new Director();
//        d.cast(new Actor("안녕"));
//        d.cast(new ActionActor("안녕2", "발차기!"));
//        d.cast(new ActionActor("안녕3", "뒷차기!"));
//        d.cast("함수");
//        d.cast("상수", "에러");
//        d.direct();

        String[] testArgs = {}; // CookTest의 main 메서드에 전달될 인자 배열
//        new CookTest().main(testArgs);
//        new Client().main(testArgs);
        new Client().main(testArgs);
    }
}
