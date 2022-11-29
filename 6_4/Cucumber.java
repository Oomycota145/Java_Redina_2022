package t6_4;

public class Cucumber extends Vegetable{
    public Cucumber(int calories) {
        super(calories);
    }

    @Override
    public void show() {
        System.out.println("Cucumber calories " + getCalories());
    }
}
