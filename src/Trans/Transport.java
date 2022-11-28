package Trans;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public final void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0) {
            this.fuelPercentage = 0;
        } else if (fuelPercentage > 100) {
            this.fuelPercentage = 100;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Введите цвет";
        }

    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else if (maxSpeed == 0) {
            System.out.println("Введите максимальную скорость");
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
        }
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed,double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public abstract void refill();



    public void printInfo() {
        System.out.println("Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", filling type=" + fuelPercentage +
                '}');
    }
}


