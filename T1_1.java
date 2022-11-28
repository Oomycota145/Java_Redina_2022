package KR_4;


import java.util.Scanner;
public class T1_1 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Input n: ");
	        int n = sc.nextInt();

	        String[] duplicate = new String[n];

	        System.out.println("Input n integer numbers: ");

	        for(int i=0;i<n;++i){
	            duplicate[i] = Integer.toString(sc.nextInt());
	        }

	        System.out.println("String representation: ");

	        for(int i=0;i<n;++i){
	            System.out.printf("%s ", duplicate[i]);
	        }


	    }
	}

