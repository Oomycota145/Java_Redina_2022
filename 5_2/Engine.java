package t5_2;

import java.util.Objects;

public class Engine {
    private int countOfFuel;

    public Engine(int countOfFuel) {
        this.countOfFuel = countOfFuel;
    }

    public void drive() {
        countOfFuel -= 10;
        if (countOfFuel > 0) {
            System.out.println("Engine Work");
        }
        else{
            System.out.println("Engine doesn't Work");
        }
    }

    public void addFuel(int fuel) {
         countOfFuel += fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return countOfFuel == engine.countOfFuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfFuel);
    }

    @Override
    public String toString() {
        return countOfFuel + "";
    }
}
