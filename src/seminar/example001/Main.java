package seminar.example001;

import seminar.example001.clients.Animal;
import seminar.example001.clients.Fish;
import seminar.example001.clients.Illness;
import seminar.example001.clients.Owner;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса
//        Animal cat = new Cat("Босс", new Owner("Вася Пупкин"),
//                LocalDate.of(2021, 10, 5), new Illness("Бешенство"), 10D);
        Animal goldFish = new Fish
                ("Золотко", new Owner("Мария Ивановна"),
                        LocalDate.of(2022, 11, 11) , new Illness("Здорова"));

//        goldFish.action();
//        goldFish.fly();
//        goldFish.go();

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        cat.setIllness(new Illness(null));
//        System.out.println(cat.getIllness());
//
//        //Animal testAnimal = new Animal();
//        //System.out.println(testAnimal.getNickName());
//
//        //cat.lifeCircle();
//
//        System.out.println(cat.getType());
//        System.out.println(cat);
//
//        Animal catty = new Cat();
//        Dog goodBoy = new Dog();
//
//        System.out.println(catty.getType());
//        System.out.println(goodBoy.getType());
//
//        System.out.println(catty);
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(catty);
//        animals.add(goodBoy);
//        animals.add(cat);
//
//        int i = 0;
//        for (Animal animal : animals){
//            System.out.println((i + " " + animal));
//            i++;
//        }
    }
}
