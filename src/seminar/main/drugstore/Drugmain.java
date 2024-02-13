package seminar.main.drugstore;

import seminar.main.drugstore.components.Water;
import seminar.main.drugstore.components.Azitronite;
import seminar.main.drugstore.components.Penicillin;
import seminar.main.drugstore.core.Component;
import seminar.main.drugstore.core.Medicament;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitronite("azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        Medicament p1 = new Medicament();
        p1.addComponents(water, azitronite);

        Medicament p2 = new Medicament();
        p2.addComponents(water, penicillin);

        Medicament p3 = new Medicament();
        p3.addComponents(azitronite, penicillin);

        List<Component> componentList = new ArrayList<>();
        componentList.add(azitronite);
        componentList.add(water);
        componentList.add(penicillin);

        System.out.println(componentList);

        componentList.sort(Comparator.reverseOrder()); // сортировка в обратном порядке
        System.out.println(componentList);
        System.out.println("_________________________________");


        List<Medicament> pharmacyList = new ArrayList<>();
        pharmacyList.add(p1);
        pharmacyList.add(p2);
        pharmacyList.add(p3);

        // Сортировка по мощности компонентов
        Collections.sort(pharmacyList);
        System.out.println("Sorted by power:");
        for (Medicament pharmacy : pharmacyList) {
            System.out.println(pharmacy);
        }

        // Сортировка по весу компонентов
        pharmacyList.sort(Comparator.comparingDouble(Medicament::getTotalWeight));
        System.out.println("\nSorted by weight:");
        for (Medicament pharmacy : pharmacyList) {
            System.out.println(pharmacy);
        }
    }
}
