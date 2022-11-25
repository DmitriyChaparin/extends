package Trans;

public class test {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 2019, "Russia", " ", 0);
        lada.printInfo();
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Russia", "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.printInfo();
        Train leningrad = new Train("Ленинград","D-125",2019,"Russia","",270,1700,0,"Ленинградского вокзала","Ленинград-Пассажирский",8);
        leningrad.printInfo();
    }
}
