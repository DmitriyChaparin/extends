package AnimalsClass;

public  class Herbivore extends Mammal {
    public Herbivore(String name, int birthYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, birthYears, livingEnvironment, travelSpeed, typeOfFood);
    }

    @Override
    public void walk() {

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

    public void pasture() {

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

