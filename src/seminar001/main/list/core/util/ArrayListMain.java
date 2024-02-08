package seminar001.main.list.core.util;

import seminar001.main.list.core.GBList;
import seminar001.main.list.core.imple.GBArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        

    }
}
