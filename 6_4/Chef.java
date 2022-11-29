package t6_4;

import package t6_3.Appliance;

import java.util.Arrays;

public class Chef {
    private Vegetable[] vegetables;

    public Chef(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public int calculateCalories(){
        int calories = 0;

        for (Vegetable vegetable : vegetables) {
            calories += vegetable.getCalories();
        }

        return calories;
    }

    public void show(){
        for (Vegetable vegetable : vegetables) {
            vegetable.show();
        }
    }

    public void sort(){
        Arrays.sort(vegetables);
    }

    public Vegetable findApplianceWithRange(int minRange, int maxRange){
        for (Vegetable vegetable : vegetables) {
            if (vegetable.getCalories() > minRange && vegetable.getCalories() < maxRange) {
                return vegetable;
            }
        }

        return null;
    }
}
