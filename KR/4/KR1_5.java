package kr4;
import java.util.Scanner;

public class KR1_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координати точки A через пробіл:");
        String str_1 = scanner.nextLine();
        String[] a = str_1.split(" ");
        System.out.println("Введіть координати точок (x1, y1, z1) та (x2, y2, z2):");
        String str_2 = scanner.nextLine();
        String[] strs = str_2.split(", ");
        int[][] arr_1 = new int[strs.length][3];
        int[] arr_2 = new int[3];
        for (int i = 0; i < strs.length; i++) {
            for (int e = 0; e < arr_2.length; e++) {
                arr_2[e] = Integer.parseInt(strs[i].split(" ")[e]);
            }
            arr_1[i] = arr_2;
        }

        int[] a_nums = new int[3];
        for (int i = 0; i < a.length; i++) {
            a_nums[i] = Integer.parseInt(a[i]);
        }

        int res = 0;
        for (int i = 0; i < arr_1.length - 1; i++){
            double b_1 = Math.pow((arr_1[i][0] - a_nums[0]), 2);
            double b_2 = Math.pow((arr_1[i][1] - a_nums[1]), 2);
            double b_3 = Math.pow((arr_1[i][2] - a_nums[2]), 2);
            double c_1 = Math.pow((arr_1[i+1][0] - a_nums[0]), 2);
            double c_2 = Math.pow((arr_1[i+1][1] - a_nums[1]), 2);
            double c_3 = Math.pow((arr_1[i+1][2] - a_nums[2]), 2);
            if (Math.sqrt(b_1 + b_2 + b_3) < Math.sqrt(b_1 + b_2 + b_3)) {
                res = i + 1;
            }
            else{
                res = i;
            }
        }
        System.out.println(strs[res]);
    }

}
