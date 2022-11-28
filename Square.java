package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Square {
  private int countSides = 4;
  private Line[] lines = new Line[countSides];
  private String color;
  private double a;
  private double b;
  private int degrees;

  public Square(Line[] lines, String color, double a, double b, int degrees) {
    this.lines = lines;
    this.color = color;
    this.a = a;
    this.b = b;
    this.degrees = degrees;
  }

  public String getSize() {
    return "Perimeter = " + (a + a + b + b);
  }

  public void setSize(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public void stretching(int times) {
    System.out.println("Stretching in " + times + " times");
    this.a *= times;
    this.b *= times;
  }

  public void compression(int times) {
    System.out.println("Compression in " + times + " times");
    this.a /= times;
    this.b /= times;
  }

  public void rotate(int degrees) {
    System.out.println("Rotating by " + degrees + " degrees");
    this.degrees += degrees;
    if (degrees > 360) degrees %= 360;
  }

  public void changeColor(String color) {
    System.out.println("Changing color from " + this.color + " to " + color);
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Square square = (Square) o;
    return countSides == square.countSides
        && Double.compare(square.a, a) == 0
        && Double.compare(square.b, b) == 0
        && degrees == square.degrees
        && Arrays.equals(lines, square.lines)
        && color.equals(square.color);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(countSides, color, a, b, degrees);
    result = 31 * result + Arrays.hashCode(lines);
    return result;
  }

  @Override
  public String toString() {
    return "Square with "
        + "countSides="
        + countSides
        + ", lines="
        + Arrays.toString(lines)
        + ", color='"
        + color
        + '\''
        + ", a="
        + a
        + ", b="
        + b
        + ", degrees="
        + degrees;
  }
}
