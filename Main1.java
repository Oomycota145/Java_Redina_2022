package org.example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Drib drib1 = new Drib(10, 20);
    Drib drib2 = new Drib(15, 30);
    Drib drib3 = new Drib(20, 50);
    Drib drib4 = new Drib(25, 100);
    ArrayList<Drib> arrayList = new ArrayList<>();
    arrayList.add(drib1);
    arrayList.add(drib2);
    arrayList.add(drib3);
    arrayList.add(drib4);
    int k = arrayList.size();
    arrayList = Drib.changeArray(arrayList);
    Drib.printArray(arrayList);
  }
}
