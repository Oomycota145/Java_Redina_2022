package KR_10;

import java.util.Scanner;

public class T1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string  = string.replaceAll("small", "very large");
        System.out.println(string);
    }
}
