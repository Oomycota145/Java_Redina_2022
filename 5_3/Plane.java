package t5_3;

import java.util.Arrays;
import java.util.Objects;

public class Plane {
    private Wing[] wings;
    private Chassis chassis;
    private Engine engine;

    private String startPoint;
    private String endPoint;

    public Plane(Chassis chassis, Wing[] wheels, Engine engine) {
        this.chassis = chassis;
        this.wings = wheels;
        this.engine = engine;
    }

    public void fly(){
        show();
        System.out.println("fly");
        engine.fly();
    }

    public void show(){
        System.out.println(startPoint + " - " + endPoint);
    }

    public void setDirect(String startPoint, String endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Arrays.equals(wings, plane.wings) && Objects.equals(chassis, plane.chassis) && Objects.equals(engine, plane.engine) && Objects.equals(startPoint, plane.startPoint) && Objects.equals(endPoint, plane.endPoint);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(chassis, engine, startPoint, endPoint);
        result = 31 * result + Arrays.hashCode(wings);
        return result;
    }

    @Override
    public String toString() {
        return startPoint + " - " + endPoint;
    }
}
