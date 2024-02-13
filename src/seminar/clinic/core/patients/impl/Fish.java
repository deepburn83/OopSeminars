package seminar.clinic.core.patients.impl;

import seminar.example001.clients.Animal;
import seminar.example001.clients.Illness;
import seminar.example001.clients.Owner;

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