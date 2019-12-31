package chapter3.demo3;

public class Main {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new StreamMilk(darkRoast);

        System.out.println(darkRoast.getDesciption() + ": "  + darkRoast.getCost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);

        System.out.println(houseBlend.getDesciption() + ": "  + houseBlend.getCost());
    }
}
