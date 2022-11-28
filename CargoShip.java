package org.example;

public class CargoShip implements Ship {
  public String name;
  public String destination;
  public int weight;

  public CargoShip() {}

  public CargoShip(String name, String destination, int weight) {
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
    System.out.println("Вантажний корабель");
  }

  @Override
  public void getSpeed() {
    System.out.println("Вантажний корабель має досить нижку швидкість: 4км/год");
  }

  @Override
  public String toString() {
    return "CargoShip{"
        + "name='"
        + name
        + '\''
        + ", destination='"
        + destination
        + '\''
        + ", weight="
        + weight
        + '}';
  }
}
