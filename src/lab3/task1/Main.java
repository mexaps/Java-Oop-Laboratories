package lab3.task1;

public class Main {
    public static void main(String[] args) {

        CandyBag candyBag = new CandyBag();
        Baravelli baravelli = new Baravelli("dulce", "Spain", 6, 12);
        Lindt lindt = new Lindt("amara", "Belgia", 4, 10, 5);
        ChocAmor chocAmor = new ChocAmor("aiwugd", "Olanda", 9);

        candyBag.addInCandyBox(baravelli);
        candyBag.addInCandyBox(lindt);
        candyBag.addInCandyBox(chocAmor);

        candyBag.printCandyBoxes();
        Area area = new Area();
        Area.p = 2;
    }
}
