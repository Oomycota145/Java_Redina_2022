package t6_2;

import java.util.Comparator;

public abstract class Sweetness implements Comparable<Sweetness> {
    private String name;
    private int countOfSugar;
    private int weight;

    public Sweetness(String name, int countOfSugar, int weight) {
        this.name = name;
        this.countOfSugar = countOfSugar;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCountOfSugar() {
        return countOfSugar;
    }

    public int getWeight() {
        return weight;
    }

    public void show(){
        System.out.println("Name - " + name + "\nCount of sugar " + countOfSugar);
    }

    @Override
    public int compareTo(Sweetness o) {
        return this.countOfSugar - o.countOfSugar;
    }

    public static Comparator<Sweetness> NameSweetness = new Comparator<Sweetness>() {
        @Override
        public int compare(Sweetness o1, Sweetness o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
