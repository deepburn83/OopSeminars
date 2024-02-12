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

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }
    @Override
    public double go() {
        System.out.println("Рыба не ходит");
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}