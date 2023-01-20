/*
Question : Given two number a and b.Find a raise to the power b.
 */

import java.util.Scanner;

public class PowerOfDigit {
    public static void main(String[] args) {
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        int a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        int b = sc.nextInt();
        while (b > 0){
            sum = sum * a;
             b--;
        }
        System.out.println("PRINTING THE FINAL VALUE AFTER DOING THE POWER OF DIGITS : ");
        System.out.println(sum);
    }
}
