package AnimalsClass;

public class Amphibian extends Animal{

    public Amphibian(String name, int birthYears, String livingEnvironment) {
        super(name, birthYears, livingEnvironment);
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

    public void hunt() {

    }
    @Override
    public String toString() {
        return "Animal{Amphibian{" +
                "name='" + getName() + '\'' +
                ", birthYears=" + getBirthYears() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
