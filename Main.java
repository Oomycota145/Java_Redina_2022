package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File("employees.txt"));
    Scanner consoleIn = new Scanner(System.in);
    int size = 4;
    String surname, inits;
    System.out.println("Enter surname of employee, which phone you want to find");
    surname = consoleIn.nextLine();
    System.out.println("Enter inits of employee, which phone you want to find");
    inits = consoleIn.nextLine();
    for (int i = 0; i < size; i++) {
      Employee employeeFromFile = new Employee();
      employeeFromFile.setSurname(in.nextLine());
      employeeFromFile.setInits(in.nextLine());
      employeeFromFile.setPhone(in.nextLine());
      if (employeeFromFile.getSurname().equals(surname)
          && employeeFromFile.getInits().equals(inits)) {
        System.out.println("Employee was founded");
        System.out.println("Employee phone: " + employeeFromFile.getPhone());
        break;
      }
    }
  }
}
