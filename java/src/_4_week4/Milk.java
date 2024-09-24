package src._4_week4;

public class Milk {
    private String name = "Milk";

    public Milk() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Milk [name=" + name + "]";
    }
}
