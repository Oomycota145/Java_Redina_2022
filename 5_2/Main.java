package t5_2;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(1);
        Wheel wheel2 = new Wheel(2);
        Wheel wheel3 = new Wheel(3);
        Wheel wheel4 = new Wheel(4);

        Engine engine = new Engine(100);
        Car car = new Car("Audi", new Wheel[]{
                wheel1,
                wheel2,
                wheel3,
                wheel4
        }, engine);

        car.drive();
        car.addFuel(100);
        car.changeWheel(new Wheel(5), 1);
        car.drive();

        System.out.println(car);
    }
}
