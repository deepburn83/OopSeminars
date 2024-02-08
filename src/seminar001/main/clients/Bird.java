package seminar001.main.clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Птица ест");
    }

    @Override
    public void go() {
        System.out.println("Птица ходит");
    }

    @Override
    public void fly() {
        System.out.println("Птица летает");
    }

    @Override
    public void swim() {
        System.out.println("Птица плавает");
    }
}