package t6_3;

import java.util.Arrays;

public class Home {
    private Appliance[] appliances;

    public Home(Appliance[] appliances) {
        this.appliances = appliances;
    }

    public int getPowerConsumption(){
        int powerConsumption = 0;

        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i].isWork()){
                powerConsumption += appliances[i].getPowerConsumption();
            }
        }

        return powerConsumption;
    }

    public void sort(){
        Arrays.sort(appliances);
    }

    public Appliance findApplianceWithRang(int minRange, int maxRange){
        for (Appliance appliance : appliances) {
            if (appliance.getPowerConsumption() > minRange && appliance.getPowerConsumption() < maxRange) {
                return appliance;
            }
        }

        return null;
    }

    public void show(){
        for (int i = 0; i < appliances.length; i++) {
            appliances[i].show();
        }
    }
}
