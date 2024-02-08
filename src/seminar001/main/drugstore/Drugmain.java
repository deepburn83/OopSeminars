package seminar001.main.drugstore;

import seminar001.main.drugstore.components.Azitronite;
import seminar001.main.drugstore.components.Penicillin;
import seminar001.main.drugstore.components.Pharmacy2;
import seminar001.main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitronite("azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(water, penicillin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        List<Component> componentList = new ArrayList<>();
        componentList.add(azitronite);
        componentList.add(water);
        componentList.add(penicillin);

        System.out.println(componentList);

        Collections.sort(componentList, Comparator.reverseOrder());
        System.out.println(componentList);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }
    }
}
