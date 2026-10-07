import java.util.Scanner;
public class DataAnalyzer{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input a single integer number");
    int integer = sc.nextInt();
    int  b = integer * 5;
    boolean isValid = (integer>10 && integer<100);


    System.out.println("\n original number :" + integer);
    System.out.println("multiplied:" + b);
    System.out.println("result ot the isValid :" + isValid);
    sc.close();

    }
}