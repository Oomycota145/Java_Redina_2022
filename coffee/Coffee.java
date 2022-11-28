package org.example.coffee;

public class Coffee implements Drinkable, Comparable<Coffee> {
  private String name;
  private int countCaffeine;
  private COFFEE_TYPE coffeeType;
  private int price;
  private int weight;

  public Coffee() {}

  public Coffee(String name, int countCaffeine, COFFEE_TYPE coffeeType, int price, int weight) {
    this.name = name;
    this.countCaffeine = countCaffeine;
    this.coffeeType = coffeeType;
    this.price = price;
    this.weight = weight;
  }

  public void howToMake() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCountCaffeine() {
    return countCaffeine;
  }

  public void setCountCaffeine(int countCaffeine) {
    this.countCaffeine = countCaffeine;
  }

  public COFFEE_TYPE getCoffeeType() {
    return coffeeType;
  }

  public void setCoffeeType(COFFEE_TYPE coffeeType) {
    this.coffeeType = coffeeType;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public int compareTo(Coffee otherCoffee) {
    double thisCoefficient = this.getPrice() / this.getWeight();
    double otherCoefficient = otherCoffee.getPrice() / otherCoffee.getWeight();
    return Double.compare(thisCoefficient, otherCoefficient);
  }
}
