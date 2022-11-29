package t6_4;

public class Tomato extends Vegetable{
    public Tomato(int calories) {
        super(calories);
    }

    @Override
    public void show() {
        System.out.println("Tomato calories " + getCalories());
    }
}
