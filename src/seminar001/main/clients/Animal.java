package seminar001.main;

import java.time.LocalDate;

public class Animal {
    private String nickName;
    private Owner owner;
    private LocalDate birthDate;
    private Illness illness;

    // Конструктор
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCircle() {
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    private void wakeUp() {
        System.out.println("Животное проснулось");
    }

    private void wakeUp(String time) {
        System.out.println("Животное проснулось в: " + time);
    }

    private void hunt() {
        System.out.println("Животное охотится");
    }

    private void eat() {
        System.out.println("Животное ест");

    }

    private void sleep() {
        System.out.println("Животное уснуло");

    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}