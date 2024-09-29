package DataTypesAndOperators;

import java.util.Scanner;

public class SwapTwoVarXOR {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter Number 2");
        int num2 = scanner.nextInt();

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("After Swapping");
        System.out.println("Number 1 is :" +num1);
        System.out.println("New Number 2 is:" +num2);

        scanner.close();
    }
}
