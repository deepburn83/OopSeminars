package seminar001.main;

import seminar001.main.clients.Animal;
import seminar001.main.clients.Cat;
import seminar001.main.clients.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);
        Animal animal = new Animal() {
            @Override
            public void eat() {

            }
        };
    }
}
