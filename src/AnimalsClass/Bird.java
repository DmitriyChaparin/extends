package AnimalsClass;

public abstract class Bird extends Animal {
    private String movementType;

    public Bird(String name, int birthYears, String livingEnvironment, String movementType) {
        super(name, birthYears, livingEnvironment);
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public abstract void hunt();


}
