package t5_2;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String brand;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String brand, Wheel[] wheels, Engine engine) {
        this.brand = brand;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive(){
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].drive();
        }

        engine.drive();
    }

    public void addFuel(int fuel){
        engine.addFuel(fuel);
    }

    public void changeWheel(Wheel newCircle, int place){
        wheels[place] = newCircle;
    }

    public void show(){
        System.out.println(brand);
    }

    @Override
    public String toString() {
        return brand + "\n" + Arrays.toString(wheels) + "\n"+engine.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Arrays.equals(wheels, car.wheels) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, engine);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }
}
