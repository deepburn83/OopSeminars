package seminar001.main;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // вместо this но из родительского класса
    }
}
