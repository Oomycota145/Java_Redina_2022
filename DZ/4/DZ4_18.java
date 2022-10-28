package dz4;

import java.util.Scanner;

public class DZ4_18 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int i=0;
	double a;
	double sum=0;
	do {
		System.out.print("a["+i+"]= ");
		a = scanner.nextDouble();
		sum+=a;
		i+=1;
		}
		while (a!=0.0);
	System.out.println("result: "+sum);
	}

}
