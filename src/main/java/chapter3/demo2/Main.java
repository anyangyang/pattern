package chapter3.demo2;

public class Main{

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.addCondiment(new Mocha());
        darkRoast.addCondiment(new StreamMilk());

        System.out.println(darkRoast.getDesciption() + ": " + darkRoast.getCost());

        HouseBlend houseBlend = new HouseBlend();
        houseBlend.addCondiment(new Soy());
        houseBlend.addCondiment(new Mocha());

        System.out.println(houseBlend.getDesciption() + ": " + houseBlend.getCost());
    }
}
