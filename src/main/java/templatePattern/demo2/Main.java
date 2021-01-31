package templatePattern.demo2;

public class Main {

    public static void main(String[] args) {
        System.out.println("prepare coffee");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        System.out.println("prepare tea");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
