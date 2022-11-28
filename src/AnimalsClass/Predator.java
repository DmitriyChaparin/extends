package AnimalsClass;

public class Predator extends Mammal{


    public Predator(String name, int birthYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, birthYears, livingEnvironment, travelSpeed, typeOfFood);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }

    public void hunt() {

    }
    @Override
    public String toString() {
        return "Animal{Mammal{Predator{" +
                "name='" + getName() + '\'' +
                ", birthYears=" + getBirthYears() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", travelSpeed=" + getTravelSpeed() +
                ", typeOfFood='" + getTypeOfFood() + '\'' +
                '}';
    }
}
