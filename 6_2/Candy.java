package t6_2;
public class Candy extends Sweetness{
    private String colorOfWrapper;

    public Candy(String name, int countOfSugar, int weight, String colorOfWrapper) {
        super(name, countOfSugar, weight);
        this.colorOfWrapper = colorOfWrapper;
    }
}
