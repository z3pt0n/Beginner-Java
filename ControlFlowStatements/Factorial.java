package ControlFlowStatements;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        long result = 1;

        for(int i =1; i <= n; i++){
            result *= i;
        }

        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }
}
