package src.example3;

public class ActionActor extends Actor {
    private final String action;

    public ActionActor(String name, String action) {
        super(name);
        this.action = action;
    }

    public void exercise() {
        System.out.println("액션배우 " + name + "은(는) " + action + "을(를) 연습합니다.");
    }

    @Override
    public void play() {
        System.out.println("액션배우 " + name + "은(는) 액션 연기합니다.");
    }
}
