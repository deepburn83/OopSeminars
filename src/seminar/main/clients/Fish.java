package seminar.main.clients;

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