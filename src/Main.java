// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit("AAA");
        Unit unit2 = new Unit("BBB");
        System.out.println(unit1);
        System.out.println(unit2);
        System.out.println();
        unit1.attack(unit2);
        unit2.attack(unit1);
        System.out.println(unit1);
        System.out.println(unit2);


        Game game1 = new Game();
        Game game2 = new Game();
        System.out.println(Game.countOfUnits);
        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");
        System.out.println(Game.countOfUnits);
        wizard1.attack(wizard2);
        System.out.println(wizard1);
        System.out.println(wizard2);



    }
}