/*
Question : find the sum of following series.
 */
import java.util.Scanner;
public class FindSum {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF DIGIT YOU WISH TO GET SUM : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE DIGIT YOU WISH TO GET SUM ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            temp = temp + arr[i];
        }
        System.out.println("RESULT :");
        System.out.println(temp);
    }
}
