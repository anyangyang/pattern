package chapter3.demo3;

public class Main {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast, 1);
        darkRoast = new StreamMilk(darkRoast, 2);

        System.out.println(darkRoast.getDesciption() + ": "  + darkRoast.getCost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend, 1);
        houseBlend = new Soy(houseBlend, 2);

        System.out.println(houseBlend.getDesciption() + ": "  + houseBlend.getCost());
    }
}
