package DecoratorPattern.demo1;

public class Main {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDesciption() + ": " + darkRoast.getCost());

        Decaf decaf = new Decaf();
        System.out.println(decaf.getDesciption() + ": " + decaf.getCost());

        DecafWithMocha decafWithMocha = new DecafWithMocha();
        System.out.println(decafWithMocha.getDesciption() + ": " + decafWithMocha.getCost());
    }

}
