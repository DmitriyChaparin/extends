package AnimalsClass;

public class Test {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Газель", 12, "Степь", 97, "Травоядные");
        Herbivore giraffe = new Herbivore("Жираф", 10, "Саваны", 55, "Травоядные");
        Herbivore horse = new Herbivore("Лошадь", 13, "Луга", 60, "Травоядные");
        Predator hyena = new Predator("Гиена", 3, "Саваны", 65, "Хищник");
        Predator tiger = new Predator("Тигр", 6, "Леса", 65, "Хищник");
        Predator bear = new Predator("Медведь", 8, "Тайга", 56, "Хищник");
        Amphibian frog = new Amphibian("Лягушка", 2, "Водоёмы");
        Amphibian adder = new Amphibian("Уж пресноводный", 1, "Водоёмы");
        Flightless peacock = new Flightless("Павлин", 4, "", "Нелетающие");
        Flightless penguin = new Flightless("Пингвин", 8, "Южное полушарие", "Нелетающие");
        Flightless dodo = new Flightless("Птица Додо", 0, "остров Маврикий", "Нелетающие");
        Flying falcon = new Flying("Сокол",3,"Степь","Летающие");
        System.out.println(gazelle);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(dodo);
        System.out.println(falcon);
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        gazelle.eat();
        horse.eat();
        horse.sleep();
        giraffe.pasture();
        giraffe.go();


    }

}

