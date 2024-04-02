package src.example4;

// README: 올바른 CookManager 예제
public class CookManager2 {
    private ICook cook;

    public CookManager2(ICook cook) {
        this.cook = cook;
    }

    public void setCook(ICook cook) {
        this.cook = cook;
    }

    public void orderRice() {
        cook.makeRice();
    }

    public void orderSoup() {
        cook.makeSoup();
    }
}
