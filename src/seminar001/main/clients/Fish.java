package seminar001.main.clients;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }
    @Override
    public void go() {
        System.out.println("Рыба не ходит");
    }
    @Override
    public void fly() {
        System.out.println("Рыба не летает");
    }
    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}