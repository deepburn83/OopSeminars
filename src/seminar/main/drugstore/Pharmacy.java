package seminar.main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components = new ArrayList<>();
    private int index = 0; // можно не писать = 0

    public void addComponents(Component ... components) {
//        for(Component c : components){
//            this.components.add(c);
        Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
