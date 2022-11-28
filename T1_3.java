package KR_4;

import java.util.Scanner;

public class T1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        double[] arrDouble = new double[n];

        System.out.println("N double numbers: ");
        for (int i=0; i<n; ++i){
            arrDouble[i] = sc.nextDouble();
        }


        double sum = 0;
        for(int i = 0; i < n; ++i){
            sum += arrDouble[i];
        }

        double mean = sum / arrDouble.length;
        double standardDeviation = 0;

        for(double num: arrDouble) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.println("Mean = " + mean);
        System.out.println("Standard deviation = "+ Math.sqrt(standardDeviation/arrDouble.length));
    }
}