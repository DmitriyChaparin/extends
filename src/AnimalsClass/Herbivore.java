package AnimalsClass;

import java.time.LocalDate;
import java.time.LocalTime;

public class Herbivore extends Mammal {
    public Herbivore(String name, int birthYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, birthYears, livingEnvironment, travelSpeed, typeOfFood);
    }

    @Override
    public void walk() {
        System.out.println("Гуляет по травке");
    }


    @Override
    public void eat() {
        if (getName().equals("Газель")) {
            System.out.println("Я " + getName() + ". Я ем траву.");
        } else if (getName().equals("Жираф")) {
            System.out.println("Я " + getName() + ". Я ем листочки с верхушек деревьев.");
        } else if (getName().equals("Лошадь")) {
            System.out.println("Я " + getName() + ". Я ем сено.");
        }
    }

    @Override
    public void go() {
        System.out.println("Топчу землю копытами");


    }

    @Override
    public void sleep() {
        LocalTime now = LocalTime.now();
        int timeToSleep = now.getHour();
        if (timeToSleep > 7 && timeToSleep < 22) {
            System.out.println(getName()+ " бодрствует.");
        } else {
            System.out.println(getName()+ " спит");
        }
    }

    public void pasture() {
        LocalTime now = LocalTime.now();
        int timeToSleep = now.getHour();
        if (timeToSleep > 13 && timeToSleep < 16) {
            System.out.println(getName() + " на пастбище");
        }
    }

    @Override
    public String toString() {
        return "Animal{Mammal{Herbivore{" +
                "name='" + getName() + '\'' +
                ", birthYears=" + getBirthYears() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", travelSpeed=" + getTravelSpeed() +
                ", typeOfFood='" + getTypeOfFood() + '\'' +
                '}';
    }


}

