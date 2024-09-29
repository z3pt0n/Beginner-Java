package ControlFlowStatements;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        int start = scanner.nextInt();
        System.out.println("Enter end");
        int end = scanner.nextInt();

        System.out.println("Numbers between" + start + "and" + end + "are: ");

        for(int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }

        scanner.close();
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        for(int i =2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
