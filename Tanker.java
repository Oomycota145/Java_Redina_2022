package org.example;

public class Tanker implements Ship {
    public String name;
    public String destination;
    public int weight;

    public Tanker() {
    }

    public Tanker(String name, String destination, int weight) {
        this.name = name;
        this.destination = destination;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void getDescription() {
    System.out.println("Танкер");
    }

    @Override
    public void getSpeed() {
    System.out.println("Танкер має досить велику швидкість");
    }

    @Override
    public String toString() {
        return "Tanker with " +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", weight=";
    }
}
