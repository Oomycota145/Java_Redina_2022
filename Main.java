package org.example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Rectangle square1 = new Rectangle("square", 10, 100);
    Rectangle square2 = new Rectangle("square", 15, 200);
    Rectangle romb1 = new Rectangle("romb", 20, 200);
    Rectangle romb2 = new Rectangle("romb", 30, 250);
    Rectangle rectangle1 = new Rectangle("rectangle", 20, 200);
    Rectangle rectangle2 = new Rectangle("rectangle", 40, 400);
    ArrayList<Rectangle> allFigures = new ArrayList<>();
    allFigures.add(square1);
    allFigures.add(square2);
    allFigures.add(romb1);
    allFigures.add(romb2);
    allFigures.add(rectangle1);
    allFigures.add(rectangle2);
    System.out.println("All figures");
    for (int i = 0; i < allFigures.size(); i++) {
      System.out.println(allFigures.get(i));
    }
    square1.addRectangle(square2);
    romb2.minusRectangle(romb1);
    rectangle1.multiplyRectangle(rectangle2);
    ArrayList<Rectangle> squares = new ArrayList<>();
    squares.add(square1);
    squares.add(square2);
    Rectangle.minMaxPerimeter(squares);
  }
}
