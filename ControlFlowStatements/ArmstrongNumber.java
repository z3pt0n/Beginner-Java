package ControlFlowStatements;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to be checked:  ");
        int num = scanner.nextInt();
        int number = num;

        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while (num!=0){
            int digit = num%10;
            sum = sum + (int) Math.pow(digit, numberOfDigits);
            num = num/10;
        }

        if (sum==number){
            System.out.println("Number is an Armstrong Number");
        }
        else{
            System.out.println("Number is not Armstrong Number");
        }

        scanner.close();
    }
}
