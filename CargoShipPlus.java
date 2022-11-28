package org.example;

public class CargoShipPlus extends CargoShip {

  public int turbo;

  public CargoShipPlus(String name, String destination, int weight, int turbo) {
    super(name, destination, weight);
    this.turbo = turbo;
  }

  @Override
  public void getDescription() {
    System.out.println("Вантажний корабель плюс");
  }

  @Override
  public void getSpeed() {
    System.out.println(
        "Вантажний корабель плюс має досить хорошу швидкість: " + (10 + turbo) + " км/год");
  }

  @Override
  public String toString() {
    return "CargoShipPlus{"
        + "turbo="
        + turbo
        + ", name='"
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
