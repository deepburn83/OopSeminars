package seminar.clinic.core.patients.impl;

import seminar.example001.clients.Animal;
import seminar.example001.clients.Illness;
import seminar.example001.clients.Owner;
import seminar.example001.Goable;
import seminar.example001.Huntable;

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
