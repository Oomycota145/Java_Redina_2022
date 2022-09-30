package kr_1;
import java.util.Scanner;
public class task2_7 {

	  public static void main(String[] args) {

	    if(args.length <= 0) {
	      System.out.println("Error");//перевірка наявності аргументів
	    } else {
	      long res = 1; //майбутній добуток
	      long next_arg = 0; //кожен наступний аргумент
	      for(String a:args) { 
	        next_arg = Long.parseLong(a); //наступний аргумент робимо типу long
	        res *= next_arg; 
	      }  
	      System.out.println("Result=" + res); //выводим результат
	    }
	  }
	}