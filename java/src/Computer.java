public class Computer {
    private String owner;

    public Computer(String owner) {
        this.owner = owner;
    }

    public void calculate() {
        System.out.println("요청 계산");
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("나의 컴퓨터");
        myComputer.calculate();
    }
}
