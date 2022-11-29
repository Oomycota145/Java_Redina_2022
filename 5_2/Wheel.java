package t5_2;

import java.util.Objects;

public class Wheel {
    private final int numberOfWheel;

    public Wheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }


    public void drive() {
        System.out.println("The "+ numberOfWheel + " wheel is drive");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return numberOfWheel == wheel.numberOfWheel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheel);
    }

    @Override
    public String toString() {
        return numberOfWheel + " wheel";
    }
}
