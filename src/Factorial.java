/*
Question : print the first n factorial numbers.
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DIGIT YOU WISH TO KNOW THE FACTORIAL :");
        int a = sc.nextInt();
        while (a > 0){
            sum = sum * a;
            a--;
        }
        System.out.println("RESULT :");
        System.out.println(sum);
    }
}
