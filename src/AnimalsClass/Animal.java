package AnimalsClass;

public abstract class Animal {
    private String name;
    private int birthYears;
    private String livingEnvironment;

    public abstract void eat();

    public abstract void go();

    public abstract void sleep();

    public final String getName() {
        return name;
    }

    public final String getLivingEnvironment() {
        return livingEnvironment;
    }

    public final int getBirthYears() {
        return birthYears;
    }

    public void setBirthYears(int birthYears) {
        if (birthYears > 0) {
            this.birthYears = birthYears;
        }
    }

    public Animal(String name, int birthYears, String livingEnvironment) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
            setBirthYears(birthYears);
            if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
                this.livingEnvironment = livingEnvironment;
            }
        }
    }


}

