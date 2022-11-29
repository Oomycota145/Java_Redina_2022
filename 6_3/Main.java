package t6_3;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(new Appliance[]{
                new Kettle(20),
                new Kettle(30),
                new Kettle(15),
                new Plate(50)
        });

        home.show();
        System.out.println();
        home.sort();
        System.out.println();
        home.show();
        System.out.println();
        home.findApplianceWithRang(35, 60).show();
    }
}
