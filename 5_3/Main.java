package t5_3;
public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(new Chassis(1), new Wing[]{
                new Wing(1),
                new Wing(2)
        }, new Engine(true));

        plane.setDirect("A", "B");
        plane.fly();
        plane.show();
    }
}
