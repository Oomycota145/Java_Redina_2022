package t5_3;

import java.util.Objects;

public class Chassis {
    private int number;

    public Chassis(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chassis chassis = (Chassis) o;
        return number == chassis.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
