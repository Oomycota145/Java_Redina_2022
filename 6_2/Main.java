package t6_2;

public class Main {
    public static void main(String[] args) {
        Sweetness candy = new Candy("Roshen", 10, 30, "Red");
        Sweetness candy1 = new Candy("ABK", 5, 25, "Blue");
        Sweetness candy2 = new Candy("Raffaelo", 10, 50, "White");
        Sweetness chocolate = new Chocolate("CHOCOLATE", 30, 90, 12);

        PresentFactory presentFactory = new PresentFactory(new Sweetness[]{
                candy, candy1, candy2, chocolate
        });

        ChildPresent childPresent = presentFactory.createChildPresent(300);

        childPresent.show();
        System.out.println();
        childPresent.sort();
        System.out.println();
        childPresent.show();

        System.out.println();
        childPresent.findSweetnessWithRangeOfSugar(1, 6).show();
    }
}
