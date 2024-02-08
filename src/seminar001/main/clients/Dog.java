package seminar001.main.clients;

import seminar001.main.Goable;
import seminar001.main.Huntable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // как this, но из родительского класса
    }

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест!");
    }

    @Override
    public void go() {
        System.out.println("Собака идёт");
    }
}
