package kr_2;
import java.util.Scanner;
public class kr_3_7 {
	public static void main(String[] args){
        double k = 6.673 * Math.pow(10, -11);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть масу m_1: ");
        double m_1 = scanner.nextDouble();
        System.out.print("Введіть масу m_2: ");
        double m_2 = scanner.nextDouble();
        System.out.print("Ввудіть відстань r: ");
        double r = scanner.nextDouble();
        double f = k*((m_1*m_2)/Math.pow(r, 2));
        System.out.println("F=" + f);
    }
}
