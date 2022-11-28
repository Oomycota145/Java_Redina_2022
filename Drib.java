package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Drib {
  private int znamennik;
  private int chiselnik;

  public Drib() {}

  public Drib(int znamennik, int chiselnik) {
    this.znamennik = znamennik;
    this.chiselnik = chiselnik;
  }

  public int getZnamennik() {
    return znamennik;
  }

  public void setZnamennik(int znamennik) {
    this.znamennik = znamennik;
  }

  public int getChiselnik() {
    return chiselnik;
  }

  public void setChiselnik(int chiselnik) {
    this.chiselnik = chiselnik;
  }

  public static ArrayList<Drib> changeArray(ArrayList<Drib> arrayList) {
    for (int i = 1; i < arrayList.size(); i++) {
      arrayList.get(i).chiselnik += arrayList.get(i).chiselnik;
      arrayList.get(i).znamennik += arrayList.get(i).znamennik;
    }
    return arrayList;
  }

  public static void printArray(ArrayList<Drib> arrayList) {
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i).getZnamennik() + "/" + arrayList.get(i).getChiselnik());
    }
  }

  @Override
  public String toString() {
    return "Drib with " + "znamennik=" + znamennik + ", chiselnik=" + chiselnik;
  }
}
