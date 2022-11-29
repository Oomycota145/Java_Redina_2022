package dz_3;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Task3_11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input numbers in format A=xxx.xxx, B=xx.xxx C=xxx.xxx");
    Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
      Matcher matcher = pattern.matcher(scanner.nextLine());
      while (matcher.find()) {
          System.out.println(matcher.group(0));
      }
      scanner.close();
  }

}