package src.example4;

public class CookTest {
    public static void main(String[] args) {
        ICook icook = new KoreanCook();
        CookManager2 manager = new CookManager2(icook);
        manager.orderRice();
        manager.orderSoup();

        ICook cook1 = new ChineseCook();
        manager.setCook(cook1);
        manager.orderRice();
        manager.orderSoup();
    }
}
