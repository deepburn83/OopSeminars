package seminar001.main.clients;

import seminar001.main.Goable;
import seminar001.main.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    //Todo напомнить спросить "в чём разница с double (заглавная и прописная)"
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount; // this всегда после super
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
    public void go() {
        System.out.println("Кошка идёт");
    }
}
