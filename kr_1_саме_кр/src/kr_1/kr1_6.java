package kr_1;

public class kr1_6 {
	public static void main(String[] args) {

	    if(args.length <= 0) {
	      System.out.println("Error");//перевірка наявності аргументів
	    } else {
	      long res = 0; //майбутня сума
	      long next_arg; //кожен наступний аргумент
	      for(String a:args) { 
	        next_arg = Long.parseLong(a); //наступний аргумент робимо типу long
	        res += next_arg; 
	      }  
	      System.out.println("Result=" + res); // результат
	    }}

}
