package seminar.main.clinic.core.patients.impl;

import seminar.main.Goable;
import seminar.main.Huntable;
import seminar.main.clients.Animal;
import seminar.main.clients.Illness;
import seminar.main.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    @Override
    public String getDiagnosis() {
        return null;
    }

    @Override
    public void eat() {
        System.out.println("Поймала мышку и ест!");
    }

     @Override
    public double go() {
        System.out.println("Кошка идёт");
         return 0;
     }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
