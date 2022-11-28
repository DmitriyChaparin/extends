package AnimalsClass;

public class Flightless extends Bird{
    public Flightless(String name, int birthYears, String livingEnvironment, String movementType) {
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

    public void walk() {
    }
    @Override
    public String toString() {
        return "Animal{Mammal{Bird{Flightless{" +
                "name='" + getName() + '\'' +
                ", birthYears=" + getBirthYears() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "movementType='" + getMovementType() + '\'' +
                '}';
    }
}
