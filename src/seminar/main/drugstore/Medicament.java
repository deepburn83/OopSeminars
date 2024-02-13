package seminar.main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Medicament implements Iterable<Component>, Comparable<Medicament> {
    private List<Component> components = new ArrayList<>();
    private int index = 0; // можно не писать = 0

    public void addComponents(Component ... components) {
//        for(Component c : components){
//            this.components.add(c);
        Collections.addAll(this.components, components);
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }
//    Эти методы ниже используем при создании анонимного класса Iterator

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { // todo возращаем итератор с помощью анонимного класса
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Medicament other) {
        // Сравниваем на основе суммарной мощности компонентов
        int thisPower = 0;
        for (Component component : components) {
            thisPower += component.getPower();
        }
        int otherPower = 0;
        for (Component component : other.components) {
            otherPower += component.getPower();
        }
        return Integer.compare(thisPower, otherPower);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medicament contains:\n");
        int totalPower = 0;
        double totalWeight = 0.0;
        for (Component component : components) {
            sb.append(component.toString()).append("\n");
            totalPower += component.getPower();
            totalWeight += component.getWeight();
        }
        sb.append("Total Power: ").append(totalPower).append("\n");
        sb.append("Total Weight: ").append(totalWeight).append("\n");
        return sb.toString();
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Component component : components) {
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }
}
