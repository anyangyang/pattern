package DecoratorPattern.demo2;

public class Main{

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.addCondiment(new Mocha(1));
        darkRoast.addCondiment(new StreamMilk(1));

        System.out.println(darkRoast.getDesciption() + ": " + darkRoast.getCost());

        HouseBlend houseBlend = new HouseBlend();
        houseBlend.addCondiment(new Soy(1));
        houseBlend.addCondiment(new Mocha(1));

        System.out.println(houseBlend.getDesciption() + ": " + houseBlend.getCost());
    }
}
