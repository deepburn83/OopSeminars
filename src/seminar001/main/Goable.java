package seminar001.main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable { // если интерфейс пустой, то он будет называться маркерным
    // public static final List<Integer> pi = new ArrayList<>();
    void go();
    default double getRunSpeed(){
        return 10;
    }
}
