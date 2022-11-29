package t5_3;

import java.util.Objects;

public class Engine {
    public boolean isWork;

    public Engine(boolean isWork) {
        this.isWork = isWork;
    }

    public void fly() {
        System.out.println("Engine Work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return isWork == engine.isWork;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWork);
    }
}
