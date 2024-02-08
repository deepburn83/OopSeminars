package seminar001.main.clients;

import java.time.LocalDate;

public abstract class Animal { // Абстрактный класс
    protected String nickName; // поле объявленное как protected будет видно внутри класса и во всех его наследниках
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

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

//    public void lifeCircle() {
//        wakeUp("12:00");
//        hunt();
//        eat();
//        sleep();
//    }

    private void wakeUp() {
        System.out.println("Животное проснулось");
    }

    private void wakeUp(String time) {
        System.out.println("Животное проснулось в: " + time);
    }

    private void hunt() {
        System.out.println("Животное охотится");
    }

    public abstract void eat();

    private void sleep() {
        System.out.println("Животное уснуло");

    }

    public void go() {
        System.out.println(getType() + "Животное двигается/ходит");
    }
    public void fly() {
        System.out.println(getType() + "Животное летает");
    }
    public void swim() {
        System.out.println(getType() + "Животное плавает");
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public void action() {
        if (this instanceof Bird) {
            fly();
        } else if (this instanceof Fish) {
            swim();
        } else {
            System.out.println("Это животное не умеет летать и плавать");
        }
    }


    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}