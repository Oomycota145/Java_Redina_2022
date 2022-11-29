package t6_3;

public abstract class Appliance implements Comparable<Appliance> {
    private boolean isWork = false;
    private final int powerConsumption;

    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void turnOn(){
        isWork = true;
    }

    public void turnOff(){
        isWork = false;
    }

    @Override
    public int compareTo(Appliance o) {
        return powerConsumption - o.powerConsumption;
    }

    public boolean isWork() {
        return isWork;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void show(){
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println("Appliance - " + powerConsumption);
        System.out.println("|||||||||||||||||||||||||||||||||");
    }
}
