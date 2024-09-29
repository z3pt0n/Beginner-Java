package ControlFlowStatements;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number for the series");
        int num = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Sequence: " + first + " " + second + " ");

        for(int i = 3; i <= num; i++){
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
        scanner.close();
    }
}
