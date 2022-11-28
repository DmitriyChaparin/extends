package Trans;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }

    @Override
    public void refill() {
        setFuelPercentage(100.00);
        String fillingType = "Можно заправлять бензином или дизелем на заправке.";
        System.out.println(getBrand() +" "+fillingType+" " + getFuelPercentage());
    }
}
