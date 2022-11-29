package t6_4;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef(new Vegetable[]{
                new Tomato(60),
                new Cucumber(30)
        });

        System.out.println("Calories of salad: " + chef.calculateCalories());
        chef.show();
        System.out.println();
        chef.sort();
        System.out.println();
        chef.show();
        System.out.println();

        chef.findApplianceWithRange(40, 70).show();
    }
}
