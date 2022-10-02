package dz2;
import java.util.Scanner; //сканер
import java.lang.Math;
public class dz_3_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //новий сканер
	    System.out.print("Input a: "); 
	    double a = scanner.nextDouble(); 
	    System.out.print("Input b: ");
	    double b = scanner.nextDouble();
	    System.out.print("Input c: ");
	    double c = scanner.nextDouble();
	    double p = (a + b + c)/2; //для формули Герона знаходимо півпериметр
	    double answer = Math.pow(p*(p - a)*(p - b)*(p - c), 0.5); 
	    //знаходимо по формулі Герона
	    System.out.printf("Your number: %f \n", answer);//ответ
	    scanner.close(); //закрываем сканер
	}

}
