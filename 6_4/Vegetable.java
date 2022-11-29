package t6_4;

public abstract class Vegetable implements Comparable<Vegetable>{
    private int calories;

    public Vegetable(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public abstract void show();

    @Override
    public int compareTo(Vegetable o) {
        return calories - o.calories;
    }
}
