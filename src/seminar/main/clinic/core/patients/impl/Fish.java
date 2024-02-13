package seminar.main.clinic.core.patients.impl;

import seminar.main.clients.Animal;
import seminar.main.clients.Illness;
import seminar.main.clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal {
    @Override
    public String getDiagnosis() {
        return null;
    }

    @Override
    public void eat() {

    }

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}