package dz2;
import java.util.Scanner; 
import java.lang.Math;

public class dz4_6g {
	public static double ctg(double a){  

        return 1/Math.tan(a);  
    }
	public static double pr_ctg(double a){  

        return -1/Math.pow(Math.sin(a),2);  
    }
	
	public static double arctg(double a){  

        return Math.atan(a);  
    }
	public static double pr_arctg(double a){  

        return 1/(1+Math.pow(a,2));  
    }
	
	 
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	    System.out.print("Angle: "); 
	    double a = scanner.nextDouble(); 
	    System.out.printf("arctg(%f) = %f \n",a, arctg(a));
	    System.out.printf("(arctg(%f))' = %f \n",a, pr_arctg(a));
	    scanner.close(); 
	}
}
