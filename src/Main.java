/*
Question : Reverse the digit of a number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of number ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE NUMBER YOU WISH TO REVERSE : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length -1; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }
    }
}