package ControlFlowStatements;

import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array");

        for(int i =0; i < n; i++){
            arr [i] = scanner.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Largest Number in the Array is: " +max);

        scanner.close();
    }

}
