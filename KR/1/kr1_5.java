package kr_1;
public class kr1_5 {

	  public static void main(String[] args) {

	    if(args.length <= 2) {
	      System.out.println("Error");//перевірка наявності трьох аргументів
	    } else {
	      System.out.println("1: "+ args[0]); //результат, власне
	      System.out.println("2: "+ args[1]); 
	      System.out.println("3: "+ args[2]); 

	    }
	  }
	}