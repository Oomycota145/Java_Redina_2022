package org.example;

import java.util.ArrayList;

public class Rectangle {
  String type;
  int perimeter;
  int square;

  public Rectangle() {}

  public Rectangle(String type, int perimeter, int square) {
    this.type = type;
    this.perimeter = perimeter;
    this.square = square;
  }

  public void addRectangle(Rectangle rectangle1) {
    System.out.println(
        "Rectangle1 + Rectangle 2: Perimeter = "
            + (perimeter + rectangle1.perimeter)
            + ", square = "
            + (square + rectangle1.square));
  }

  public void minusRectangle(Rectangle rectangle1) {
    System.out.println(
        "Rectangle1 - Rectangle 2: Perimeter = "
            + (perimeter - rectangle1.perimeter)
            + ", square = "
            + (square - rectangle1.square));
  }

  public void multiplyRectangle(Rectangle rectangle1) {
    System.out.println(
        "Rectangle1 * Rectangle 2: Perimeter = "
            + (perimeter * rectangle1.perimeter)
            + ", square = "
            + (square * rectangle1.square));
  }

  public void divideRectangle(Rectangle rectangle1) {
    System.out.println(
        "Rectangle1 / Rectangle 2: Perimeter = "
            + (double) (perimeter / rectangle1.perimeter)
            + ", square = "
            + (double) (square / rectangle1.square));
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(int perimeter) {
    this.perimeter = perimeter;
  }

  public int getSquare() {
    return square;
  }

  public void setSquare(int square) {
    this.square = square;
  }

  public static void minMaxPerimeter(ArrayList<Rectangle> rectangles) {
    int min = 1000000;
    int max = -1000000;
    int posMin = 0;
    int posMax = 0;
    for (int i = 0; i < rectangles.size(); i++) {
      Rectangle rectangle = rectangles.get(i);
      if (rectangle.getPerimeter() < min) {
        min = rectangle.getPerimeter();
        posMin = i;
      }
      if (rectangle.getPerimeter() > max) {
        max = rectangle.getPerimeter();
        posMax = i;
      }
    }
    System.out.println("Min Rectangle from group " + rectangles.get(0).getType());
    System.out.println(rectangles.get(posMin));
    System.out.println("Max Rectangle from group " + rectangles.get(0).getType());
    System.out.println(rectangles.get(posMax));
  }

  @Override
  public String toString() {
    return "Rectangle with "
        + "type='"
        + type
        + '\''
        + ", perimeter="
        + perimeter
        + ", square="
        + square;
  }
}
