package farm;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(100, 5, "Suyur");
        Horse horse = new Horse(60, 4, "jylky");
        Sheep sheep = new Sheep(20, 3, "Baran");

        Farm farm = new Farm("Masaliev 12", 5, 3, 2, "Con-Kara");
        Farm farm2 = new Farm("Ibraimov", 1, 1, 1, "Batken");



        System.out.println(cow);
        System.out.println(horse);
        System.out.println(sheep);

        System.out.println(farm);
        System.out.println();
        System.out.println(farm2);

    }
}
