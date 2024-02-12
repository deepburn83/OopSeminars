package seminar.main.clients;

import seminar.main.Goable;
import seminar.main.Huntable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    @Override
    public String getDiagnosis() {
        return null;
    }

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
    public double go() {
        System.out.println("Собака идёт");
        return 0;
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
