package Trans;

public class test {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 2019, "Russia", " ", 0,55);
        lada.printInfo();
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Russia", "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11,45);
        lastochka.printInfo();
        Train leningrad = new Train("Ленинград","D-125",2019,"Russia","",270,1700,0,"Ленинградского вокзала","Ленинград-Пассажирский",8,23);
        leningrad.printInfo();
        Bus paz = new Bus("ПАЗ", "1133", 2010, "Россия", "жёлтый", 110,66);
        Bus ikarus = new Bus("Ikarus", "M332", 1998, "Чехия", "красный", 105,77);
        Bus maz = new Bus("MАЗ", "Э-556", 2018, "Буларусь", "синий", 120,120);
        paz.printInfo();
        ikarus.printInfo();
        maz.printInfo();
        lastochka.refill();
        lada.refill();


    }
}
