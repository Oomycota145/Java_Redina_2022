package org.example.van;

import org.example.coffee.COFFEE_TYPE;
import org.example.coffee.Coffee;

import java.util.ArrayList;
import java.util.Collections;

public class Van {
  private String name;
  private int maxVolume;
  private int currentVolume;
  private ArrayList<Coffee> availableCoffee;

  public Van(String name, int volume) {
    System.out.println("Van with name " + name + " was created\nMax volume = " + volume);
    this.name = name;
    this.maxVolume = volume;
    availableCoffee = new ArrayList<>();
  }

  public void addCoffee(Coffee coffee) {
    if (currentVolume + coffee.getWeight() > maxVolume) {
      System.out.println("There is not enough space in van for this coffee");
    } else {
      System.out.println(
          "Coffee "
              + coffee.getName()
              + " with weight "
              + coffee.getWeight()
              + " was added to van");
      availableCoffee.add(coffee);
      currentVolume += coffee.getWeight();
    }
  }

  public void deleteCoffee(Coffee coffee) {
    if (availableCoffee.contains(coffee)) {
      System.out.println(
          "Coffee "
              + coffee.getName()
              + " with weight "
              + coffee.getWeight()
              + " was deleted from van");
      availableCoffee.remove(coffee);
      currentVolume -= coffee.getWeight();
    } else {
      System.out.println("Coffee " + coffee.getClass() + " was now present int the van");
    }
  }

  public void printByType(COFFEE_TYPE coffeeType) {
    System.out.println("Available coffee in van with type " + coffeeType.getClass().getName());
    for (int i = 0; i < availableCoffee.size(); i++) {
      if (availableCoffee.get(i).getCoffeeType().equals(coffeeType)) {
        System.out.println(availableCoffee.get(i));
      }
    }
  }

  public void printBySorting() {
    System.out.println("Available coffee sorting by price/weight ");
    Collections.sort(availableCoffee);
    for (int i = 0; i < availableCoffee.size(); i++) {
      System.out.println(availableCoffee.get(i));
    }
  }

  public String getAvailableWeight() {
    return "Currently " + name + " has available " + (maxVolume - currentVolume) + " weight";
  }

  public void setCurrentVolume(int currentVolume) {
    this.currentVolume = currentVolume;
  }
}
