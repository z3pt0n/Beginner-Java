package DataTypesAndOperators;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args){
        // create a scanner for input
        Scanner scanner = new Scanner(System.in);

        //Input number 1
        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();

        //Input number 2
        System.out.println("Enter Number two: ");
        double num2 = scanner.nextDouble();

        //prompt for choice
        System.out.println("Choose an Operation: ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num2!= 0){
                    result = num1/num2;
                } else {
                    System.out.println("Error");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("Result of the operation is :" + result );

        scanner.close();
    }
}
