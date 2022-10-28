package kr4;
import java.util.Scanner;

public class KR1_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа через пробіл:");
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        int[] array = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.valueOf(strs[i]);
        }
        int x = 0;
        int y = 1;
        int [] array_chastot = new int[array.length];
        for (int e = 0; e < array.length - 1; e++){
            if (array[e] == array[e+1]){
                x = array[e];
                y += 1;
            }
        }
        System.out.println(y + "підряд чисел" + x);
        }

}
