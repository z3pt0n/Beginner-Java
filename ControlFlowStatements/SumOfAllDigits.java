package ControlFlowStatements;

import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int sum = 0;

        while (n >0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }

        System.out.println("Sum of all digits in the given number are: " +sum);

        scanner.close();
    }
}
