package seminar.main.clinic.core.patients.impl;

import seminar.main.clients.Animal;
import seminar.main.clients.Illness;
import seminar.main.clients.Owner;
import seminar.main.clinic.core.patients.Flyable;
import seminar.main.clinic.core.patients.Goable;

import java.time.LocalDate;

public class Bird extends Animal implements Goable, Flyable {
    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    @Override
    public String getDiagnosis() {
        return null;
    }

    @Override
    public void eat() {
        System.out.println("Птица ест");
    }

    @Override
    public void swim() {
        System.out.println("Птица плавает");
    }
    @Override
    public double go() {
        return 5.0;
    }
    @Override
    public double fly() {
        return 50.0;
    }
}