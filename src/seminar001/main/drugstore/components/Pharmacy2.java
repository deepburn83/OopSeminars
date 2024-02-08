package seminar001.main.drugstore.components;

import seminar001.main.drugstore.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component> {
    private List<Component> components = new ArrayList<>();
    private int index = 0; // можно не писать = 0

    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
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
}
