package seminar.example001.clients;

import seminar.example001.Goable;
import seminar.example001.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    //Todo напомнить спросить "в чём разница с double (заглавная и прописная)"
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount; // this всегда после super
    }

    @Override
    public String getDiagnosis() {
        return null;
    }

    public Cat() {
        super();
        this.discount = 10D; // 10 Double
    }

    @Override
    public void eat() {
        System.out.println("Поймала мышку и ест!");
    }

    public void meow() {
        System.out.println("Мяу");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + "Discount: {" + discount + "}";
    }

    @Override
    public double go() {
        System.out.println("Кошка идёт");
        return 0;
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
