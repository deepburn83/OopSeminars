package seminar.example001;

@FunctionalInterface
public interface Goable { // если интерфейс пустой, то он будет называться маркерным
    // public static final List<Integer> pi = new ArrayList<>();
    double go();
    default double getRunSpeed(){
        return 10;
    }
}
