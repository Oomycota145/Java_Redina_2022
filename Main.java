package org.example;

public class Main {
  public static void main(String[] args) {
    Dot start1 = new Dot(10);
    Dot end1 = new Dot(15);
    Dot start2 = new Dot(10);
    Dot end2 = new Dot(15);
    Line line1 = new Line(25, start1, end1);
    Line line2 = new Line(25, start2, end2);
    Line lines[] = {line1, line2, line1, line2};
    Square square = new Square(lines, "black", 10, 15, 90);
    square.changeColor("white");
    square.compression(3);
    square.stretching(3);
    square.rotate(90);
    System.out.println(square);
  }
}
