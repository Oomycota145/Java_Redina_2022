package kr4;
import java.util.Scanner;
import java.util.Arrays;
public class KR1_3 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n:");
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введіть число:");
            array[i] = scanner.nextDouble();
        }
        double x = Arrays.stream(array).sum();
        System.out.println(x);
        double[] array_sum = new double[array.length];

        for (int e = 0; e < array.length; e++){
            array_sum[e] = Math.pow(array[e] - x, 2);
        }
        double s = Math.sqrt(Arrays.stream(array_sum).sum()/(array.length-1));
        System.out.printf("Середне з цих чисел: %f", x);
        System.out.printf("\n");
        System.out.printf("Відхилення: %f", s);

    }

}
