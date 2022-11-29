package t5_3;

import java.util.Objects;

public class Wing {
    private int number;

    public Wing(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wing wing = (Wing) o;
        return number == wing.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
