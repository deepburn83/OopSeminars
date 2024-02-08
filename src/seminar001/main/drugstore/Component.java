package seminar001.main.drugstore;

public abstract class Component {
    private String title;
    private Double weight;
    private int power;

    // Construct (вызывается с помощью Alt+Insert)
    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }
}
