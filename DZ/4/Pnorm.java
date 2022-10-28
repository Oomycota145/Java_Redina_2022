package dz4;
import java.util.Scanner;
public class Pnorm {
	 public static void main(String[] args) {
		 if(args.length !=1) {
			 System.out.println("Error");
			 
		 }
		 else {
			 int p=Integer.parseInt(args[0]);
			 double sum=0;
			 System.out.println("Введіть числа: ");
			 Scanner scanner = new Scanner(System.in);
		     String data = scanner.nextLine();
		     try (Scanner s = new Scanner(data)) {
		    	    while (s.hasNextInt()) {
		    	        double num = s.nextDouble();
		    	        sum+=Math.pow(num,p);
		    	        
		    	        
		    	    }
		    	    System.out.println("result: "+sum);
		    	}
       
		 }
	 }
}
