package src.example4;

public class ChineseCook implements ICook {
    public void makeRice() {
        System.out.println("중식 밥을 짓습니다.");
    }

    public void makeSoup() {
        System.out.println("중식국물을 만듭니다.");
    }

    public void makeSalad() {
        System.out.println("중식 무침을 만듭니다.");
    }

    public void makeSource() {
        System.out.println("중식 양념을 만듭니다.");
    }
}
