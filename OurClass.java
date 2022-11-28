package org.example;

public class OurClass {
  public void method1() {
    System.out.println("Виклик першого методу");
    this.method2();
    method2();
  }

  public void method2() {
    System.out.println("Виклик другого методу");
  }
}
