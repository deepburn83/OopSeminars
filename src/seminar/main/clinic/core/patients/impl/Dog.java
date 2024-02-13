package seminar.main.clinic.core.patients.impl;

import seminar.main.Goable;
import seminar.main.Huntable;
import seminar.main.clients.Animal;
import seminar.main.clients.Illness;
import seminar.main.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, String name) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getDiagnosis() {
        return null;
    }

    @Override
    public void eat() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
