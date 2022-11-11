package kr_7_1;

import java.util.Scanner;

class Fraction_c { 
  private int n;
  private int m;
  
  public Fraction_c(int n, int m) {
    this.n = n;
    this.m = m;
  }
  
  public Fraction_c() { 
    this.n = 0;
    this.m = 1;
  }
  public int getM() {
    return m;
  }

  public int getN() {
    return n;
  }
  
  public int gcd() { 
    int a = n;
    int b = m;
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }
  public void check() { 
    int checker = gcd();
    if (n % m == 0) {
      n = n / m;
      m = 1;
    } else if (checker != 1) {
      n = n / checker;
      m = m / checker;
    }
  }
  public void add(Fraction_c other) { 
    if (this.m == other.m) {
      this.n += other.n;
    } else {
      int a = this.n * other.m + this.m * other.n;
      int b = this.m *other.m;
      this.n = a;
      this.m = b;
    }
    check();
  }
  public void mult(Fraction_c other) {
    int a = this.n * other.n;
    int b = this.m *other.m;
    this.n = a;
    this.m = b;
    check();
  }
  @Override
  public String toString() {
    return n + "/" + m;
  }
}
class Poly{ 
  private int n;
  Fraction_c[] arrayn;
  
  public Poly(int n) { 
    this.n = n;
    arrayn = new Fraction_c[n];
  }

  public void print_out() { 
    System.out.printf("\n"); 
    boolean is_empty = true; 
    for (int i = 0; i < n; i++) {
      if (this.arrayn[i].getN() != 0) {
        System.out.printf("(%s)*x^%d ", this.arrayn[i], i);
        is_empty = false;
      }
      if (i != this.n-1 & !is_empty) {
        System.out.printf(" + ");
        is_empty = true;
      }
    }
    System.out.printf("\n");
  }
}
public class kr_4_1 {
	  public static Poly sumPoly(Poly p1, Poly p2) { 
	    int length_this = p1.arrayn.length;
	    int length_that = p2.arrayn.length;  
	    Fraction_c[] array_to_add;
	    if (length_this > length_that) {
	      array_to_add = p1.arrayn;
	      for (int i = 0; i <length_that; i++) {
	        array_to_add[i].add(p2.arrayn[i]);
	      }
	    } else {
	      array_to_add = p2.arrayn;
	      for (int j = 0; j <length_this; j++) {
	        array_to_add[j].add(p1.arrayn[j]);
	      }
	    }
	    Poly answer = new Poly(array_to_add.length);
	    answer.arrayn = array_to_add;
	    return answer;
	  }
	  public static void main( String[] args )
	      {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Input k: "); 
	    int k = scanner.nextInt();
	    Poly[] array_poly = new Poly[k];
	    int next_degree;
	    int next_n, next_m;
	    for (int i = 0; i < k; i++) {
	      System.out.printf("Степінь поліному номер %d: ", i+1);
	      next_degree = scanner.nextInt();
	      array_poly[i] = new Poly(next_degree+1);
	      for (int coof = 0; coof <= next_degree; coof ++) {
	        System.out.printf("Введення коефіцієнту (n/m) при х^%d: ", coof);
	        System.out.print("Input n: ");
	        next_n = scanner.nextInt();
	        System.out.print("Input m: ");
	        next_m = scanner.nextInt();
	        array_poly[i].arrayn[coof] = new Fraction_c(next_n, next_m);
	      }
	    }
	    System.out.print("Введені поліноми: ");
	    array_poly[0].print_out();
	    Poly pol_answer = array_poly[0];
	    if (k > 1) {
	      array_poly[1].print_out();
	      pol_answer = sumPoly(array_poly[0], array_poly[1]);
	      for (int j = 2; j < k; j++) {
	        array_poly[j].print_out();
	        pol_answer = sumPoly(array_poly[j], pol_answer);
	      }      
	    }
	    System.out.print("Та сума: ");
	    pol_answer.print_out();  
	    scanner.close();
	      }
	}
