package AnimalsClass;

public abstract class Mammal extends Animal {
    private  int travelSpeed;
    private String typeOfFood;

    public Mammal(String name, int birthYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, birthYears, livingEnvironment);
        if (travelSpeed > 0) {
            this.travelSpeed = travelSpeed;
        }
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood=typeOfFood;
        }
    }

    public final int getTravelSpeed() {
        return travelSpeed;
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    public abstract void walk();


}

