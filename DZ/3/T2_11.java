package dz_3;

import java.util.Scanner;

public class T2_11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input 1-st number (a): ");
    long a = scanner.nextInt();
    System.out.print("Input 2-nd number (b): ");
    long b = scanner.nextByte();
    System.out.printf("a + b = b + a = %d\n", a + b);
    System.out.print("a - b: ");
    if(a < b) {
      System.out.print("Impossible\n");
    }
    else {
      System.out.printf("%d\n", a - b);
    }
    System.out.print("b - a = ");
    if(b < a) {
      System.out.print("Impossible\n");
    }
    else {
      System.out.printf("%d\n", b - a);
    }
    System.out.printf("a / b = %d (remainder %d)\n", a/b, a%b);
    System.out.printf("b / a = %d (remainder %d)\n", b/a, b%a);
    System.out.printf("a %% b = %d\n", a%b);
    System.out.printf("b %% a = %d\n", b%a);
    scanner.close();
  }

}