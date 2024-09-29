package ControlFlowStatements;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int rows = scanner.nextInt();

        System.out.println("Choose Pattern to Print: ");
        System.out.println("1. Right Angled Triangle");
        System.out.println("2. Pyramid");
        System.out.println("3. Inverse Pyramid");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                printRightAngledTriangle(rows);
                break;
            case 2:
                printPyramid(rows);
                break;
            case 3:
                printInversePyramid(rows);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        scanner.close();
    }

    public static void printRightAngledTriangle(int rows){
        for (int i=1; i <= rows; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int rows){
        for (int i=1; i<= rows; i++){
            for(int j=1; j <= rows - i; j++){
                System.out.print(" ");
            }

            for(int k =1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInversePyramid(int rows){
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
