package t6_2;

public class Chocolate extends Sweetness{
    private int countOfSquare;

    public Chocolate(String name, int countOfSugar, int weight, int countOfSquare) {
        super(name, countOfSugar, weight);
        this.countOfSquare = countOfSquare;
    }
}
