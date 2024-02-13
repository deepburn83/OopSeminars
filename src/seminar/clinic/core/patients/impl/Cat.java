package seminar.clinic.core.patients.impl;

import seminar.example001.clients.Animal;
import seminar.example001.clients.Illness;
import seminar.example001.clients.Owner;
import seminar.example001.Goable;
import seminar.example001.Huntable;

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
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
