package t6_2;

import java.util.Arrays;

public class ChildPresent {
    private Sweetness[] present;
    private int weight;

    public ChildPresent(Sweetness[] present, int weight) {
        this.present = present;
        this.weight = weight;
    }

    public void sort(){
        Arrays.sort(present, Sweetness.NameSweetness);
    }

    public Sweetness findSweetnessWithRangeOfSugar(int minRange, int maxRange){
        for (Sweetness sweetness : present) {
            if (sweetness.getCountOfSugar() > minRange && sweetness.getCountOfSugar() < maxRange) {
                return sweetness;
            }
        }

        return null;
    }

    public void show(){
        for (Sweetness sweetness : present) {
            sweetness.show();
        }
    }
}
