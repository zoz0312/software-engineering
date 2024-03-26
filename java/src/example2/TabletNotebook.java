package src.example2;

public class TabletNotebook extends Notebook {
    private String regstPenModel;

    public TabletNotebook(String name, int initChag, String pen) {
        super(name, initChag);
        regstPenModel = pen;
    }

    public void write(String penInfo) {
        if (getBatteryinfo() >= 1) {
            return;
        }
    }
}
