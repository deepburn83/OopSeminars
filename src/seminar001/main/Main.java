package seminar001.main.clients;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса
        Animal cat = new Animal("Босс", new Owner("Вася Пупкин"),
                LocalDate.of(2021, 10, 5), new Illness("Бешенство"));
        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());

        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

        cat.lifeCircle();

        System.out.println(cat.getType());
        System.out.println(cat);


    }
}
