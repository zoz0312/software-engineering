package src.example4;

// README: 잘못된 CookManager 예제
public class CookManager1 {
    private ICook cook = new KoreanCook();

    public void orderRice() {
        cook.makeRice();
    }

    public void orderSoup() {
        cook.makeSoup();
    }
}
