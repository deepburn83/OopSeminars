package seminar.main.drugstore.core;

public abstract class Component implements Comparable<Component>{
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, Power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {

//        1-й вариант
//        if(this.power < o.power){
//            return -1;
//        }
//        else if(this.power > o.power){
//            return 1;
//        }
//        else return 0;

//        2-й вариант
//        return this.power - o.power;

//        3-й вариант (логика 2-го варианта короткой записью)
        return Integer.compare(this.power, o.power);
    }
}
