package Trans;

public class Train extends Transport{
    private double price;
    private double travelTime;
    private String station;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,double price, double travelTime, String station, String endingStation, int numberOfWagons,double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed,fuelPercentage);
        this.price = price;
        this.travelTime = travelTime;
        this.station = station;
        this.endingStation = endingStation;
        setNumberOfWagons(numberOfWagons);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        } else if (numberOfWagons == 0) {
            System.out.println("Введите количество вагонов");
        } else {
            this.numberOfWagons = Math.abs(numberOfWagons);
        }
    }


    @Override
    public void refill() {
        setFuelPercentage(100.00);
        String fillingType = "Нужно заправлять дизелем.";
        System.out.println(getBrand() +" "+fillingType+" " + getFuelPercentage());
    }

    public void printInfo () {
       super.printInfo();
        System.out.println( "Train{" +
                "price=" + price +
                ", travelTime=" + travelTime +
                ", station='" + station + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}');
    }
}
