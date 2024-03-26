package src;

import src.example3.ActionActor;
import src.example3.Actor;
import src.example3.Director;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();
        d.cast(new Actor("안녕"));
        d.cast(new ActionActor("안녕2", "발차기!"));
        d.cast(new ActionActor("안녕3", "뒷차기!"));
        d.cast("함수");
        d.cast("상수", "에러");
        d.direct();
    }
}
