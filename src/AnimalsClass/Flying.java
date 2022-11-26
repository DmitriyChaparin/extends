package AnimalsClass;

public class Flying extends Bird {
    public Flying(String name, int birthYears, String livingEnvironment, String movementType) {
        super(name, birthYears, livingEnvironment, movementType);
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
    public void hunt() {

    }

    public void fly() {
    }
    @Override
    public String toString() {
        return "Animal{Mammal{Bird{Flying{" +
                "name='" + getName() + '\'' +
                ", birthYears=" + getBirthYears() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "movementType='" + getMovementType() + '\'' +
                '}';
    }
}
