package seminar.example001.clients;

import java.time.LocalDate;

public class Bird extends Animal {
    @Override
    public String getDiagnosis() {
        return null;
    }

    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Птица ест");
    }

    @Override
    public double go() {
        System.out.println("Птица ходит");
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Птица плавает");
    }
}