package src.example3;

public class Actor {
    public String name;

    public Actor(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("배우 " + name + "은 연기합니다.");
    }
}
