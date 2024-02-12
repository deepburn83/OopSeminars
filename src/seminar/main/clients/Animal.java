package seminar.main.clients;

import java.time.LocalDate;

public abstract class Animal {
    public String name; // Абстрактный класс
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

    public Animal(String name) {
        this.name = name;
    }

    public String getPatientName() {
        return name;
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


    private void wakeUp() {
        System.out.println("Животное проснулось");
    }

    private void wakeUp(String time) {
        System.out.println("Животное проснулось в: " + time);
    }

    private void hunt() {
        System.out.println("Животное охотится");
    }

    public abstract String getDiagnosis();

    public abstract void eat();

    private void sleep() {
        System.out.println("Животное уснуло");

    }

    public double go() {
        System.out.println(getType() + "Животное двигается/ходит");
        return 0;
    }

    public void swim() {
        System.out.println(getType() + "Животное плавает");
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}