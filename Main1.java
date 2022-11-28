package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File("rectangles.txt"));
    int size = 4;
    Rectangle rectangles[] = new Rectangle[size];
    int max = -1;
    int pos = -1;
    for (int i = 0; i < size; i++) {
      Rectangle rectangleFromFile = new Rectangle();
      rectangleFromFile.setId(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setUpperX(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setUpperY(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setLowerX(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setLowerY(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setA(Integer.valueOf(in.nextLine()));
      rectangleFromFile.setB(Integer.valueOf(in.nextLine()));
      rectangles[i] = rectangleFromFile;
      if (rectangleFromFile.square() > max) {
        max = rectangleFromFile.square();
        pos = i;
      }
    }
    System.out.println("Rectangle with max square");
    System.out.println(rectangles[pos]);
  }
}
